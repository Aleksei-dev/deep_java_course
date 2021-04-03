package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

/**
 * Created by coval on 3/26/2021.
 */
public class ContactModificationTests extends TestBase {

  @Test
  public void testContactModification(){
    app.getContactHelper().goToHomePage();
    app.getContactHelper().editContact();
    app.getContactHelper().fillContactForm(new ContactData("Test1", "Test2", "Test 1 - 233", "+3725353535353", "test1@mail.ru", null), false);
    app.getContactHelper().submitContactModification();
    app.getContactHelper().goToHomePage();
  }
}
