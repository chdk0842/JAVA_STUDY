package project01_03;

public class GetSet {
	private int speed;
	private boolean stop; //자동차가 멈췄을 때 true, 자동차가 달릴 떼 false

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if (speed < 0) {
			this.speed = 0;
			return;
		}else {
		this.speed = speed;
		}
	}

	public boolean isStop() {
		return stop;
	}

	public void setStop(boolean stop) {
		this.stop = stop;
		if (stop == true) this.speed = 0;
	}

//   public int getSpeed() {
//	  return this.speed;
//   }
//   
//   public void setSpeed(int speed) {
//	  this.speed = speed;
//   }

}
