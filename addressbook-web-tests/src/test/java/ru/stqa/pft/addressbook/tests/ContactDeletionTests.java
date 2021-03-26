package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

/**
 * Created by coval on 3/26/2021.
 */
public class ContactDeletionTests extends TestBase {

  @Test
  public void testContactDeletion(){
    app.getContactHelper().goToHomePage();
    app.getContactHelper().selectContact();
    app.getContactHelper().deleteSelectedContact();
    app.getContactHelper().submitContactDeletion();
  }
}
