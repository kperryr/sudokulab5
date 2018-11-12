package pkgEnum;

import java.util.HashMap;
import java.util.Map;

public enum eGameDifficulty { 
	EASY(100), MEDIUM(500), HARD(1000);
	
	private int iDifficulty;

	private static final Map<Integer,eGameDifficulty> lookup= new HashMap<Integer,eGameDifficulty>(); 
	
	static {
        for (eGameDifficulty diff : eGameDifficulty.values()) {
            lookup.put(diff.getiDifficulty(), diff);
        }
    }
	
	private eGameDifficulty(int iDifficulty) {
		this.iDifficulty=iDifficulty;
	}

	public int getiDifficulty() {
		return iDifficulty;
	}
	
	public static eGameDifficulty get(int iDiff) {
		return lookup.get(iDiff);
		
	}
	
	
	
	

}
