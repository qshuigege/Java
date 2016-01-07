import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import json.Person;

/*import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Test {
	public static void main(String[] args) throws ParseException {
		String dateStr = "2015-05-22 17:31:04";
		SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date d = f.parse(dateStr);
		System.out.println(d);
		java.math.BigDecimal big;
		java.lang.Integer inte;
	}
	

*/
/*
insert into  b2b_interface_note (note_id, inter_id, inter_b2bfield, inter_erpfield, inter_fieldtype) values (seq_b2b_interface_note.nextval, '014', 'BCFHJE', 'BCFHJE', 'java.lang.String');
insert into  b2b_interface_note (note_id, inter_id, inter_b2bfield, inter_erpfield, inter_fieldtype) values (seq_b2b_interface_note.nextval, '014', 'DDH', 'DDH', 'java.lang.String');
insert into  b2b_interface_note (note_id, inter_id, inter_b2bfield, inter_erpfield, inter_fieldtype) values (seq_b2b_interface_note.nextval, '014', 'WFHJE', 'WFHJE', 'java.math.BigDecimal');
*/

/*



insert into b2b_interface_note (note_id, inter_id, inter_b2bfield, inter_erpfield, inter_fieldtype) values (seq_b2b_interface_note.nextval, '030', 'id', 'id', 'java.lang.String');     
insert into b2b_interface_note (note_id, inter_id, inter_b2bfield, inter_erpfield, inter_fieldtype) values (seq_b2b_interface_note.nextval, '030', 'orgid', 'orgid', 'java.lang.String');     
insert into b2b_interface_note (note_id, inter_id, inter_b2bfield, inter_erpfield, inter_fieldtype) values (seq_b2b_interface_note.nextval, '030', 'bindid', 'bindid', 'java.lang.String');     
insert into b2b_interface_note (note_id, inter_id, inter_b2bfield, inter_erpfield, inter_fieldtype) values (seq_b2b_interface_note.nextval, '030', 'createdate', 'createdate', 'java.util.Date');       
insert into b2b_interface_note (note_id, inter_id, inter_b2bfield, inter_erpfield, inter_fieldtype) values (seq_b2b_interface_note.nextval, '030', 'createuser', 'createuser', 'java.lang.String');     
insert into b2b_interface_note (note_id, inter_id, inter_b2bfield, inter_erpfield, inter_fieldtype) values (seq_b2b_interface_note.nextval, '030', 'updatedate', 'updatedate', 'java.util.Date');       
insert into b2b_interface_note (note_id, inter_id, inter_b2bfield, inter_erpfield, inter_fieldtype) values (seq_b2b_interface_note.nextval, '030', 'updateuser', 'updateuser', 'java.lang.String');     
insert into b2b_interface_note (note_id, inter_id, inter_b2bfield, inter_erpfield, inter_fieldtype) values (seq_b2b_interface_note.nextval, '030', 'processdefid', 'processdefid', 'java.lang.String');    
insert into b2b_interface_note (note_id, inter_id, inter_b2bfield, inter_erpfield, inter_fieldtype) values (seq_b2b_interface_note.nextval, '030', 'isend', 'isend', 'java.lang.Integer');    
insert into b2b_interface_note (note_id, inter_id, inter_b2bfield, inter_erpfield, inter_fieldtype) values (seq_b2b_interface_note.nextval, '030', 'ddh', 'ddh', 'java.lang.String');     
insert into b2b_interface_note (note_id, inter_id, inter_b2bfield, inter_erpfield, inter_fieldtype) values (seq_b2b_interface_note.nextval, '030', 'xh', 'xh', 'java.lang.String');     
insert into b2b_interface_note (note_id, inter_id, inter_b2bfield, inter_erpfield, inter_fieldtype) values (seq_b2b_interface_note.nextval, '030', 'je', 'je', 'java.math.BigDecimal'); 
insert into b2b_interface_note (note_id, inter_id, inter_b2bfield, inter_erpfield, inter_fieldtype) values (seq_b2b_interface_note.nextval, '030', 'lh', 'lh', 'java.lang.String');     
insert into b2b_interface_note (note_id, inter_id, inter_b2bfield, inter_erpfield, inter_fieldtype) values (seq_b2b_interface_note.nextval, '030', 'dj', 'dj', 'java.lang.String');     
insert into b2b_interface_note (note_id, inter_id, inter_b2bfield, inter_erpfield, inter_fieldtype) values (seq_b2b_interface_note.nextval, '030', 'scpc', 'scpc', 'java.lang.String');     
insert into b2b_interface_note (note_id, inter_id, inter_b2bfield, inter_erpfield, inter_fieldtype) values (seq_b2b_interface_note.nextval, '030', 'rkrq', 'rkrq', 'java.util.Date');       
insert into b2b_interface_note (note_id, inter_id, inter_b2bfield, inter_erpfield, inter_fieldtype) values (seq_b2b_interface_note.nextval, '030', 'price', 'price', 'java.math.BigDecimal'); 
insert into b2b_interface_note (note_id, inter_id, inter_b2bfield, inter_erpfield, inter_fieldtype) values (seq_b2b_interface_note.nextval, '030', 'sl', 'sl', 'java.lang.Integer');    
insert into b2b_interface_note (note_id, inter_id, inter_b2bfield, inter_erpfield, inter_fieldtype) values (seq_b2b_interface_note.nextval, '030', 'sjkcl', 'sjkcl', 'java.lang.Integer');    
insert into b2b_interface_note (note_id, inter_id, inter_b2bfield, inter_erpfield, inter_fieldtype) values (seq_b2b_interface_note.nextval, '030', 'kchkcl', 'kchkcl', 'java.lang.Integer');    
insert into b2b_interface_note (note_id, inter_id, inter_b2bfield, inter_erpfield, inter_fieldtype) values (seq_b2b_interface_note.nextval, '030', 'shr', 'shr', 'java.lang.String');     
insert into b2b_interface_note (note_id, inter_id, inter_b2bfield, inter_erpfield, inter_fieldtype) values (seq_b2b_interface_note.nextval, '030', 'pm', 'pm', 'java.lang.String');     
insert into b2b_interface_note (note_id, inter_id, inter_b2bfield, inter_erpfield, inter_fieldtype) values (seq_b2b_interface_note.nextval, '030', 'thsl', 'thsl', 'java.math.BigDecimal'); 
insert into b2b_interface_note (note_id, inter_id, inter_b2bfield, inter_erpfield, inter_fieldtype) values (seq_b2b_interface_note.nextval, '030', 'sdgs', 'sdgs', 'java.lang.String');     
insert into b2b_interface_note (note_id, inter_id, inter_b2bfield, inter_erpfield, inter_fieldtype) values (seq_b2b_interface_note.nextval, '030', 'dz', 'dz', 'java.lang.String');     
insert into b2b_interface_note (note_id, inter_id, inter_b2bfield, inter_erpfield, inter_fieldtype) values (seq_b2b_interface_note.nextval, '030', 'lxr', 'lxr', 'java.lang.String');     
insert into b2b_interface_note (note_id, inter_id, inter_b2bfield, inter_erpfield, inter_fieldtype) values (seq_b2b_interface_note.nextval, '030', 'dh', 'dh', 'java.lang.String');     

*/

public class Test {
	public static void main(String[] args) {
		/*List<String> list = new ArrayList<String>();
		list = null;
		if(null!=list.get(0)&&list.size()>0){
			System.out.println("ok...");
		}else{
			System.out.println("aaa...");
		}*/
		/*list.add("aa{aaa}aa");
		list.add("bbbbbbb");
		list.add("ccccccc");
		System.out.println(list.get(0));
		replace(list.get(0));
		System.out.println(list.get(0));*/
		
		/*String str = "aaa";
		Person p = new Person();
		p.setName(null);
		System.out.println(str + p.getName());*/
		
		/*Map<String, String> map = new HashMap<String, String>();
		map.put("", "");
		map.put(null, null);
		map.put("a", "a");
		System.out.println(map.size());*/
		String lc = System.getProperty("line.separator");
		System.out.println("aaa"+lc+"bbb");
		
		
		
	}

	private static void replace(String temp) {
		// TODO Auto-generated method stub
		temp = temp.replace("{aaa}", "xxx");
		System.out.println(temp);
	}
	
}











/*<param name="USERID"></param>
<param name="USERNAME"></param>
<param name="PASSWORD"></param>
<param name="ROLEID"></param>
<param name="MOBILE"></param>
<param name="EMAIL"></param>
<param name="ZCSJ"></param>
<param name="HYLX"></param>
<param name="QYQC"></param>
<param name="QYJC"></param>
<param name="KHH"></param>
<param name="YHZH"></param>
<param name="GSZCH"></param>
<param name="ZJJGH"></param>
<param name="YBNSRH"></param>
<param name="ZCDZ"></param>
<param name="FRXM"></param>
<param name="FRDH"></param>
<param name="FRSFZH"></param>
<param name="YYZZFJ"></param>
<param name="LXR"></param>
<param name="LXRSJ"></param>
<param name="LXRDH"></param>
<param name="LXRCZ"></param>
<param name="QTFJ"></param>
<param name="BZ"></param>
<param name="KHBM"></param>
<param name="FSKHBM"></param>
<param name="KHMC"></param>
<param name="YWLX"></param>
<param name="JKSWZY"></param>
<param name="JKSWZYMOBILE"></param>
<param name="JKSWZYEMAIL"></param>
<param name="JKYWY"></param>
<param name="JKYWYMOBILE"></param>
<param name="JKYWYEMAIL"></param>*/

/*<table id='tbl_user_info'>
<tr><td>账号：</td><td><input name='USERID' class='no_edit' value= '<#USERID>'/></td><td>用户名：</td><td><input name='USERNAME' value='<#USERNAME>'/></td></tr>
<tr><td>角色：</td><td><input name='ROLEID' class='no_edit' value= '<#ROLEID>'/></td><td>手机号码：</td><td><input name='MOBILE' value='<#MOBILE>'/></td></tr>
<tr><td>邮箱：</td><td><input name='EMAIL' value='<#EMAIL>'/></td><td>注册时间：</td><td><input name='ZCSJ' value='<#ZCSJ>'/></td></tr>
<tr><td>会员类型：</td><td><input name='HYLX' value='<#HYLX>'/></td><td>企业全称：</td><td><input name='QYQC' value='<#QYQC>'/></td></tr>
<tr><td>企业简称：</td><td><input name='QYJC' value='<#QYJC>'/></td><td>开户行：</td><td><input name='KHH' value='<#KHH>'/></td></tr>
<tr><td>银行账号：</td><td><input name='YHZH' value='<#YHZH>'/></td><td>工商注册号：</td><td><input name='GSZCH' value='<#GSZCH>'/></td></tr>
<tr><td>组织机构号：</td><td><input name='ZJJGH' value='<#ZJJGH>'/></td><td>一般纳税人号：</td><td><input name='YBNSRH' value='<#YBNSRH>'/></td></tr>
<tr><td>注册地址：</td><td><input name='ZCDZ' value='<#ZCDZ>'/></td><td>法人姓名：</td><td><input name='FRXM' value='<#FRXM>'/></td></tr>
<tr><td>法人电话：</td><td><input name='FRDH' value='<#FRDH>'/></td><td>法人身份证号码：</td><td><input name='FRSFZH' value='<#FRSFZH>'/></td></tr>
<tr><td>富森商务专员：</td><td><input name='JKSWZY' value='<#JKSWZY>'/></td><td>富森商务专员手机：</td><td><input name='JKSWZYMOBILE' value='<#JKSWZYMOBILE>'/></td></tr>
<tr><td>富森商务专员邮箱：</td><td><input name='JKSWZYEMAIL' value='<#JKSWZYEMAIL>'/></td><td>富森业务员：</td><td><input name='JKYWY' value='<#JKYWY>'/></td></tr>
<tr><td>富森业务员手机：</td><td><input name='JKYWYMOBILE' value='<#JKYWYMOBILE>'/></td><td>富森业务员邮箱：</td><td><input name='JKYWYEMAIL' value='<#JKYWYEMAIL>'/></td></tr>
</table>

<tr><td>账号：</td><td><input name='' value= ''/></td><td>用户名：</td><td><input name='USERNAME' value=''/></td></tr>
<tr><td>账号：</td><td><input name='' value= ''/></td><td>用户名：</td><td><input name='USERNAME' value=''/></td></tr>
<tr><td>账号：</td><td><input name='' value= ''/></td><td>用户名：</td><td><input name='USERNAME' value=''/></td></tr>
<tr><td>账号：</td><td><input name='' value= ''/></td><td>用户名：</td><td><input name='USERNAME' value=''/></td></tr>
<tr><td>账号：</td><td><input name='' value= ''/></td><td>用户名：</td><td><input name='USERNAME' value=''/></td></tr>
<tr><td>账号：</td><td><input name='' value= ''/></td><td>用户名：</td><td><input name='USERNAME' value=''/></td></tr>
<tr><td>账号：</td><td><input name='' value= ''/></td><td>用户名：</td><td><input name='USERNAME' value=''/></td></tr>
<tr><td>账号：</td><td><input name='' value= ''/></td><td>用户名：</td><td><input name='USERNAME' value=''/></td></tr>
<tr><td>账号：</td><td><input name='' value= ''/></td><td>用户名：</td><td><input name='USERNAME' value=''/></td></tr>
<tr><td>账号：</td><td><input name='' value= ''/></td><td>用户名：</td><td><input name='USERNAME' value=''/></td></tr>
<tr><td>账号：</td><td><input name='' value= ''/></td><td>用户名：</td><td><input name='USERNAME' value=''/></td></tr>
<tr><td>账号：</td><td><input name='' value= ''/></td><td>用户名：</td><td><input name='USERNAME' value=''/></td></tr>*/


