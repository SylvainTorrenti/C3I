package advcomp.calcul.service.impl;

import advcomp.calcul.service.CalculService;

public class CalculServiceImpl implements CalculService {

	public CalculServiceImpl() {
		super();
	}

	@Override
	public Double additionner(Double fact1, Double fact2) {
		return fact1 + fact2;
	}
	
	@Override
	public Double soustraire(Double fact1, Double fact2) {
		return fact1 - fact2;
	}
	
	@Override
	public Double multiplier(Double fact1, Double fact2) {
		return fact1 * fact2;
	}
	
	@Override
	public Double diviser(Double fact1, Double fact2) {
		return fact1 / fact2;
	}
}
