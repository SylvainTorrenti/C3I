package advcomp.calcul.service.impl;

import advcomp.calcul.service.CalculService;

public class CalculServiceBugImpl implements CalculService {

	public CalculServiceBugImpl() {
		super();
	}

	@Override
	public Double additionner(Double fact1, Double fact2) {
		return fact1 + fact2 * 2;
	}
	
	@Override
	public Double soustraire(Double fact1, Double fact2) {
		return 0d;
	}
	
	@Override
	public Double multiplier(Double fact1, Double fact2) {
		return fact1 * fact2 * 0.001;
	}
	
	@Override
	public Double diviser(Double fact1, Double fact2) {
		return fact1 / fact2;
	}
}
