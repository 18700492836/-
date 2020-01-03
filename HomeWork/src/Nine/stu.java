package Nine;

import java.util.HashMap;

public class stu {
		private String name;
		private String professional;
		public stu() {
		}
		public stu(String name, String professional) {
			super();
			this.name = name;
			this.professional = professional;
		}
		@Override
		public String toString() {
			return  professional;
		}
		public static void main(String[] args) {
			stu stu = new stu("李明","信管专业14级");
			stu stu2 = new stu("刘丽","信管专业14级");
			HashMap<Object, Object> map = new HashMap<Object, Object>();
			map.put("140301", stu);
			map.put("140302",stu2);
			System.out.println("键集："+map.keySet());
			System.out.println("值集："+map.values());
			System.out.println("键-值对集合:"+map);
		}
}