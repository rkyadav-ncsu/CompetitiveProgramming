package programComp;
import java.util.Hashtable;
import java.util.*;


public class LibraryNuage 
{
	Hashtable<Integer,PacketRule> Alc_list=new Hashtable<Integer,PacketRule>();
	ArrayList<Integer> queue=new ArrayList<Integer>();
	public boolean Acl_list_create(String NAME,String ACTION )
	{
		if(Alc_list.containsKey(NAME))
		{
			return false;
		}
		else
		{
			if(ACTION.equalsIgnoreCase("Deny"))
			{
				return false;
			}
			else
			{
				
				return true;
			}
		}
	}
	
	//Acl_Add_Rule
	public boolean Acl_add_rule(String ACLNAME,String SRC_IP_PREFIX,String DST_IP_PREFIX,String PROTO,String SRC_PORT, String DST_PORT,int PRIORITY, String ACTION)
	{
		if(ACLNAME.equalsIgnoreCase("*"))
		{
			return false;
		}
		
		if(Acl_list_create(ACLNAME,ACTION))
		{
			PacketRule packetRule=PacketRule.CreatePacketRule(ACLNAME, SRC_IP_PREFIX, DST_IP_PREFIX, PROTO, SRC_PORT, DST_PORT, PRIORITY);
			if(Alc_list.contains(PRIORITY))
			{
				return false;
			}
			queue.add(PRIORITY);
			Alc_list.put(PRIORITY,packetRule);
			return true;
		}
		return false;
	}
	
	public String Acl_check_packet(String ACLNAME,String SRC_IP,String DST_IP,String PROTO,String SRC_PORT, String DST_PORT)
	{
		
		Collections.sort(queue);
		for(int i:queue)
		{
			if(Alc_list.get(i)!=null)
			{
				PacketRule packetRule=Alc_list.get(i);
				String sourceIP=packetRule.SRC_IP_PREFIX;
				String sourceIPSubnet=sourceIP.substring(sourceIP.indexOf("/")+1);
				String dstIPSubnet=packetRule.DST_IP_PREFIX.substring(packetRule.DST_IP_PREFIX.indexOf("/")+1);
				if(sourceIPSubnet=="32" || packetRule.SRC_IP_PREFIX.equalsIgnoreCase("*"))
				{
					if(SRC_IP.equalsIgnoreCase(packetRule.SRC_IP_PREFIX))
					{
						if(dstIPSubnet=="32" || packetRule.DST_IP_PREFIX.equalsIgnoreCase("*"))
						{
							if(DST_IP.equalsIgnoreCase(packetRule.DST_IP_PREFIX))
							{
								if(packetRule.ACLNAME.equalsIgnoreCase(ACLNAME) && packetRule.PROTO.equalsIgnoreCase(PROTO)&& packetRule.SRC_PORT.equalsIgnoreCase(SRC_PORT)&& packetRule.DST_PORT.equalsIgnoreCase(DST_PORT))
								{
									return "ALLOW";
								}
								return "DENY";
							}
							else
								return "DENY";
						}
						else if(dstIPSubnet=="24" || packetRule.DST_IP_PREFIX.equalsIgnoreCase("*"))
						{
							String dst_ip_temp=DST_IP.substring(DST_IP.indexOf(".")+1);
							dst_ip_temp=DST_IP.substring(DST_IP.indexOf(".")+1);
							if(Integer.parseInt(dst_ip_temp)<256)
							{
								
							}
							if(DST_IP.equalsIgnoreCase(packetRule.DST_IP_PREFIX))
							{
								if(packetRule.ACLNAME.equalsIgnoreCase(ACLNAME) && packetRule.PROTO.equalsIgnoreCase(PROTO)&& packetRule.SRC_PORT.equalsIgnoreCase(SRC_PORT)&& packetRule.DST_PORT.equalsIgnoreCase(DST_PORT))
								{
									return "ALLOW";
								}
								return "DENY";
							}
							else
								return "DENY";
						}
						
						
					}
				}
			
				
			}
		}
		return "DENY";
	}
	public void Acl_del_rule(String ACLNAME,int PRIORITY)
	{
		PacketRule packetRule=Alc_list.get(PRIORITY)==null?new PacketRule():Alc_list.get(PRIORITY);
		if(packetRule.ACLNAME.equalsIgnoreCase(ACLNAME))
		{
			Alc_list.remove(PRIORITY);
		}
	}
	public boolean Acl_list_rule(String NAME)
	{
		return false;
	}
}
final class PacketRule
{
	public String ACLNAME;
	public String SRC_IP_PREFIX;
	public String DST_IP_PREFIX;
	public String PROTO;
	public String SRC_PORT;
	public String DST_PORT;
	public int PRIORITY;
	public static PacketRule CreatePacketRule(String aCLNAME,String sRC_IP_PREFIX,String dST_IP_PREFIX,String pROTO,String sRC_PORT, String dST_PORT,int pRIORITY)
	{
		PacketRule packetRule=new PacketRule();
		packetRule.ACLNAME=aCLNAME;
		packetRule.SRC_IP_PREFIX=sRC_IP_PREFIX;
		packetRule.DST_IP_PREFIX=dST_IP_PREFIX;
		packetRule.PROTO=pROTO;
		packetRule.SRC_PORT=sRC_PORT;
		packetRule.DST_PORT=dST_PORT;
		packetRule.PRIORITY=pRIORITY;
		
		return packetRule;
	}
}




