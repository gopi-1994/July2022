package com.july.test.oops;

 class staticcase_this {
	public static void main(String[] args) {
		q te =new q(334, "erer", 25425);
		te.dispal();
		}
}
	class q {
		int a;
		String name;
		float fee;

		q(int a, String name, float fee) {
			// Using this keyword
			this.a = a;
			this.name = name;
			this.fee = fee;
			// TODO Auto-generated method stub

		}

		void dispal() {
			System.out.println(a + name + fee);
		}
			
	}

	class detail {
		
	}


