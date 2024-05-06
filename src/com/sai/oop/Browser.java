package com.sai.oop;

public class Browser {
//    Coupling : The level of dependency among classes.
//    We generally try to reduce the coupling pts(for eg. methods) by calling them in a single method.
//    Similar to Data Hiding, we try to hide methods.

//    Ad:
//    Any Main class using inner methods will have least impact
//    due to any changes or updation made in source code of inner methods.
//    Hence, avoid errors while updation of source code.

    public String navigate(String address){
//        We added findIPAddress() and fetchData() in navigate() to reduce coupling
        String ip = findIPAddress(address);
        String html = fetchData(ip);
        return html;
    }

    private String findIPAddress(String address){
        return "127.0.0.1";
    }

    private String fetchData(String ip) {
//        If in future we want to modify fetchData(),
//        from   fetchData(ip)   to  fetchData(ip, credentials)
//        we easily can do it worrying about its impact on the Main class using fetchData()
        return "<html></html>";
    }
}

//public class Main{
//    public static void main(String[] args) {
//        var browser = new Browser();
//        System.out.println(browser.navigate("openai.com"));
//    }
//}
