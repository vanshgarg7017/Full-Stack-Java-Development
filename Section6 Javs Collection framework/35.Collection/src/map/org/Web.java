package map.org;

import java.util.Map;
import java.util.TreeMap;

class Code implements Comparable<Code>{
	private String sectionNo;
	private String lectionNo;
	public Code(String sectionNo,String lectureNo) {
		super();
		this.sectionNo=sectionNo;
		this.lectionNo=lectureNo;
	}
	
	public String getSectionNo() {
		return sectionNo;
	}

	public String getLectionNo() {
		return lectionNo;
	}

	@Override
	public String toString() {
		return "Code [sectionNo=" + sectionNo + ", lectionNo=" + lectionNo + "]";
	}

	@Override
	public int compareTo(Code o) {
		String code1=sectionNo.concat(lectionNo);
		String code2=o.getSectionNo()+o.getLectionNo();
		return code1.compareTo(code2);
	}
	
}
public class Web {
public static void main(String[] args) {
	Map<Code,String> lectures=new TreeMap<>();
	lectures.put(new Code("S01", "L03"), "generic");
	lectures.put(new Code("S01", "L01"), "Files under java");
	lectures.put(new Code("S02", "L02"), "Network Programming");
	lectures.put(new Code("S02", "L07"), "OOPS");
	Code code=null;
	for(Map.Entry<Code,String> entry: lectures.entrySet()) {
		if(entry.getValue().equals("OOPS")) {
			code=entry.getKey();
		}
	}
	System.out.println("The key for value\"OOPS\":"+code);
	
	
	
	
	
	
	
	
	
	
	
	
}
}
