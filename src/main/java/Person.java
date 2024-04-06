/*Да се напише програма која ќе овозможи внесување на информации за лица, вклучувајќи го нивното име
и адреса (улицата, градот иnпоштенскиот код). Програмата нека вклучува две класи: Person и Address. 
Класата Person нека има атрибут за име и атрибут за адреса, која е објект од класата Address. 
Класата Address има атрибути за улица, град и поштенски код.*/


public class Person {
private String name;
private Address adresa;

	public Address getAdresa() {
	return adresa;
}

public void setAdresa(Address adresa) {
	this.adresa = adresa;
}

	public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Person p1 = new Person();
p1.setName("John");



Address adresa = new Address();
adresa.setCity("New York");
adresa.setStreet("123 Street");
adresa.setZipCode(505);

p1.setAdresa(adresa);

System.out.println("Person name: "+p1.getName()+",\naddress: "+p1.getAdresa().getCity()+", "+ p1.getAdresa().getStreet()+", "+p1.getAdresa().getZipCode());

	}

}
