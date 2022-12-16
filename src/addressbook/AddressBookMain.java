package addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookMain{
    Scanner sc = new Scanner(System.in);

    ArrayList<Person> list = new ArrayList<>();


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("welcome to address book ");

        AddressBookMain addressBookMain = new AddressBookMain();
         while(true){
             System.out.println(" enter 1 for add contact");
             System.out.println(" enter 2 for edit contact");
             System.out.println(" enter 3 for delete contact");
             System.out.println(" enter 4 for display contact");
             System.out.println("enter 5 for exit ");
              int input = sc.nextInt();

              switch (input){
                  case 1:
                      addressBookMain.addContact();
                      break;
                  case 2:
                      addressBookMain.editContact();
                      break;
                  case 3:
                      addressBookMain.deleteContact();
                      break;
                  case 4:
                      addressBookMain.displayContact();
                      break;
                  case 5:
                      System.exit(0);
                      break;
                  default:
                      break;
              }
         }



    }




    public void addContact() {

        Person person = new Person();

        System.out.println(" enter 1 st name ");
        person.setFirstName(sc.next());
        System.out.println(" enter Last Name  ");
        person.setLastName(sc.next());
        System.out.println(" enter address  ");
        person.setAddress(sc.next());
        System.out.println(" enter  City ");
        person.setCity(sc.next());
        System.out.println(" enter State ");
        person.setState(sc.next());
        System.out.println(" enter zip code ");
        person.setZip(sc.next());
        System.out.println(" enter phone number ");
        person.setPhoneNumber(sc.next());
        System.out.println(" enter email ");
        person.setEmail(sc.next());

        System.out.println(" contact add Successfully");
        list.add(person);
        System.out.println(person);
    }

    private void editContact() {
        System.out.println("enter name for edit " );
        String name = sc.next();

        for (Person person: list){
            if (name.equals(person.getFirstName())){

                System.out.println(" enter 1 st name ");
                person.setFirstName(sc.next());
                System.out.println(" enter Last Name  ");
                person.setLastName(sc.next());
                System.out.println(" enter address  ");
                person.setAddress(sc.next());
                System.out.println(" enter  City ");
                person.setCity(sc.next());
                System.out.println(" enter State ");
                person.setState(sc.next());
                System.out.println(" enter zip code ");
                person.setZip(sc.next());
                System.out.println(" enter phone number ");
                person.setPhoneNumber(sc.next());
                System.out.println(" enter email ");
                person.setEmail(sc.next());

                System.out.println(" edit contact Successfully");
                System.out.println(person);
            }


        }
    }
    private void deleteContact() {
        System.out.println("enter name for edit ");
        String name = sc.next();
        for (Person person : list) {
            if (name.equals(person.getFirstName())) {
                list.remove(person);
                System.out.println(" Contact Delete Successfully");
                break;

            }


        }
    }
    private void displayContact() {
        System.out.println(list);

        }
    }
