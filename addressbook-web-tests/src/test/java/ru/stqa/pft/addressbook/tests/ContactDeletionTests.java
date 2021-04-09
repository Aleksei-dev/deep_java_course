package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

/**
 * Created by coval on 3/26/2021.
 */
public class ContactDeletionTests extends TestBase {

  @Test
  public void testContactDeletion() throws InterruptedException {
    app.getContactHelper().goToHomePage();
    if (! app.getContactHelper().isThereAContact()){
      app.getContactHelper().createContact(new ContactData("Test", "Test", "Test 1 - 2", "+5252525", "test@mail.ru", "test1"), true);
    }
    int before = app.getContactHelper().getContactCount();
    app.getContactHelper().selectContact();
    app.getContactHelper().deleteSelectedContact();
    app.getContactHelper().submitContactDeletion();
    Thread.sleep(90);
    app.getContactHelper().goToHomePage();
    int after = app.getContactHelper().getContactCount();
    Assert.assertEquals(after, before - 1);
  }
}
