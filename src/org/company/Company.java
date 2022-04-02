package org.company;

import org.client.Client;

public class Company extends Client {
public void companyName() {
System.out.println("csscorp");
}
public static void main(String[] args) {
Company c = new Company();
c.clientName();
c.companyName();
}
}
