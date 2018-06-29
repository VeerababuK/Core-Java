package examples;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

    public static void main(String[] args) {
        Map<String, String> refreshConfigurationProperties = new HashMap<>();

        refreshConfigurationProperties.put("key", "value");
        refreshConfigurationProperties.put("ACCT_AUTH_MAX_ACCT", "100");

        System.out.println(refreshConfigurationProperties.get("ACCT_AUTH_MAX_ACCT"));

    }
}
