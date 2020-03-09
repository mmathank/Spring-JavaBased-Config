package spring.sample;

public class FirstAidMedicalService implements MedicalService {

	@Override
	public String assist() {
		return "Provide Water";
	}

}
