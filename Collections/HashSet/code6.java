import java.util.*;

class CricPlayer implements Comparable<CricPlayer> {
	    int jerNo = 0;
	        String pName = null;

		    CricPlayer(int jerNo, String pName) {
			            this.jerNo = jerNo;
				            this.pName = pName;
					        }

		        public String toString() {
				        return jerNo + ":" + pName;
					    }

			    @Override
			        public int compareTo(CricPlayer other) {
					System.out.println("Royal Rajya");
					        return this.pName.equals(other.pName) ? 0 : -1;
						    }

			        @Override
				    public boolean equals(Object obj) {
					            if (this == obj) {
					System.out.println("Royal Rajya");
						                return true;
					            }
						    if (!(obj instanceof CricPlayer)) {
					System.out.println("Royal Rajya");
						                return false;
						    }
					            CricPlayer other = (CricPlayer) obj;
					System.out.println("Royal Rajya");
					       	                return pName.equals(other.pName);
			    }
		@Override
		public int hashCode(){
		
					System.out.println("Royal Rajya");
			return pName.hashCode();
		}		
}

class HashSetDemo {
	    public static void main(String[] args) {
		            LinkedHashSet<CricPlayer> hs = new LinkedHashSet<>();

			            hs.add(new CricPlayer(7, "MSDhoni"));
				            hs.add(new CricPlayer(18, "Virat"));
					            hs.add(new CricPlayer(45, "Rohit Sharma"));
						            hs.add(new CricPlayer(7, "MSDhoni"));
							            hs.add(new CricPlayer(69, "Jeet"));

								            System.out.println(hs);
									        }
}

