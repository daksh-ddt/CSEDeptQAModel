import java.util.ArrayList;
import java.util.List;

/**
 * Custom string helper functions
 * 
 * @author daksh_ddt
 *
 */
public class StringUtils {
	
	public String getQuotedString(String str){
		return "'"+str+"'";
	}
	
	public List<String> getBatchQuotedStrings(List<String> tokenList){
		List<String> tokens = new ArrayList<String>();
		for (String string : tokenList) {
			string = getQuotedString(string);
			tokens.add(string);
		}
		return tokens;
	}
}
