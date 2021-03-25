package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase {

  @Test
  public void testContactCreation() throws Exception {
    app.getContactHelper().initContactCreation();
    app.getContactHelper().fillContactForm(new ContactData("Test", "Test", "Test 1 - 2", "+5252525", "test@mail.ru"));
    app.getContactHelper().submitContactCreation();
    app.getContactHelper().returnToHomePage();
  }
}
