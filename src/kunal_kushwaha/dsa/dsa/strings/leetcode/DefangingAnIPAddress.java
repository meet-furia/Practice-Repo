package kunal_kushwaha.dsa.dsa.strings.leetcode;

public class DefangingAnIPAddress {
    public static void main(String[] args) {
        String s = "Meet";
        System.out.println(s);

        String address1 = "255.100.50.0";
        String defangedAddress1 = defangIPaddr(address1);
        System.out.println(defangedAddress1);

        String address2 = "1.1.1.1";
        String defangedAddress2 = defangIPaddr(address2);
        System.out.println(defangedAddress2);

    }

    static public String defangIPaddr(String address) {
        String defangedIPAddress = "";
        for (int i = 0; i < address.length(); i++){
            if (address.charAt(i) == '.'){
                defangedIPAddress += "[.]";
            }
            else {
                defangedIPAddress += address.charAt(i);
            }
        }

        return defangedIPAddress;
    }

}
