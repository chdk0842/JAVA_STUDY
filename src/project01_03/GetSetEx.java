package project01_03;

public class GetSetEx {

	public static void main(String[] args) {
		GetSet getset = new GetSet();
		getset.setSpeed(10);
		System.out.println(getset.getSpeed());

		if(!getset.isStop()) { //달리고 있을 때
			getset.setStop(true); //멈춤
			
		}
		System.out.println(getset.getSpeed());
	}

}
