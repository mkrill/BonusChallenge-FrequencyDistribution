import java.util.Hashtable;
import java.util.Set;

public class FrequencyDistribution {

	// Hashtable for storing frequencies => symbols as keys, frequency as value
	private Hashtable<String, Integer> distribution = new Hashtable<String, Integer>();

	public int getSymbolFreq(String symbol) {
		return this.distribution.get(symbol);
	}

	public void incSymbolFreq(String symbol) {
		// if symbol already exists in distribution hashtable
		if (this.distribution.containsKey(symbol)) {
			// increase counter (value)
			this.distribution.put(symbol, this.distribution.get(symbol) + 1);
		} else {
			// add element and set value to 1
			this.distribution.put(symbol, 1);
		}
	}

	public void displayFrequencies() {

		Set<String> keySet = distribution.keySet();
		for (String key : keySet) {
			System.out.println(key + ": " + this.getSymbolFreq(key));
		}

	}

	public static void main(String[] args) {

		FrequencyDistribution fdis = new FrequencyDistribution();

		for (String symbol : args) {
			fdis.incSymbolFreq(symbol);
		}

		fdis.displayFrequencies();

	}
}
