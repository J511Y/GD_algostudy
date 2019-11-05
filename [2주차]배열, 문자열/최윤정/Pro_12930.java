package study2;

class Solution4 {
	  public String solution(String s) {
	      char[] arr = s.toCharArray();
	      StringBuffer sb = new StringBuffer();
	      int num=-1;
	      for (int i = 0; i < arr.length; i++) {
	    	  if(arr[i]==' ') {
	    		  num=i;
	    		  sb.append(arr[i]);
	    	  }
	    	  else {
	    		if((i-num)%2==1) {
	    			  sb.append(String.valueOf(arr[i]).toUpperCase());
	    		}else {
	    			  sb.append(String.valueOf(arr[i]).toLowerCase());
	    		}
	    	  }  
	     }
	      return sb.toString();
	  }
	}

public class Pro_12930 {
	public static void main(String[] args) {
		Solution4 s = new Solution4();
		System.out.println(s.solution("try hello world"));
	}
}
