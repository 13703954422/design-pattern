package 适配器模式;

public class Adapter implements IPicture{

	NewPicture np = new NewPicture();
	@Override
	public void getRGB() {
		np.getR();
		np.getG();
		np.getB();
	}

}
