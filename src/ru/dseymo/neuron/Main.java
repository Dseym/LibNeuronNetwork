package ru.dseymo.neuron;

import java.util.Arrays;

import ru.dseymo.neuron.network.LearnDataSet;
import ru.dseymo.neuron.network.Network;

public class Main {

	public static void main(String[] args) {
		
		Network network = new Network(3, 1);
		
		LearnDataSet lds = new LearnDataSet();
		lds.learning_rate = 0.1;
		lds.iterations = 100;
		lds.addData(new double[] {1, 0, 0}, new double[] {1})
		   .addData(new double[] {0, 1, 0}, new double[] {1})
		   .addData(new double[] {1, 1, 1}, new double[] {1})
		   .addData(new double[] {0, 1, 1}, new double[] {1})
		   //.addData(new double[] {0, 0, 1}, new double[] {1})
		   .addData(new double[] {0, 0, 0}, new double[] {0});
		network.logs = true;
		network.train(lds);
		
		System.out.println(Arrays.toString(network.query(new double[] {1, 0, 0})));
		System.out.println(Arrays.toString(network.query(new double[] {0, 1, 0})));
		System.out.println(Arrays.toString(network.query(new double[] {1, 1, 1})));
		System.out.println(Arrays.toString(network.query(new double[] {0, 0, 0})));

	}

}
