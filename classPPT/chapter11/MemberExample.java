package chapter11;

public class MemberExample {
	public static void main(String[] args) {
		Member obj1 = new Member("blue");
		Member obj2 = obj1;
		Member obj3 = new Member("red");

		if (obj1.equals(obj2)) { // equals()<- 객체비교 메서드 같으면 true 다르면 false
			System.out.println("obj1과 obj2는 동등합니다.");
		} else {
			System.out.println("obj1과 obj2는 동등하지 않습니다.");
		}

		if (obj1.equals(obj3)) {
			System.out.println("obj1과 obj3는 동등합니다.");
		} else {
			System.out.println("obj1과 obj3는 동등하지 않습니다.");
		}
	}
}

class Member {
	public String id;

	public Member(String id) {
		this.id = id;
	}
}