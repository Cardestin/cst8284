package Week4AradioExemple;

public class Radio {
	
		private int volume; 
		private double frequency; 
		
		
		public Radio ( int vol,  double freq) {
			this.setVolume(vol); 
			this.setFrequency(freq); 
			
		}


		public int getVolume() {
			return volume;
		}


		public void setVolume(int vol) {
			volume = vol;
		}


		public double getFrequency() {
			return frequency;
		}


		public void setFrequency(double freq) {
			frequency = freq;
		}

}
