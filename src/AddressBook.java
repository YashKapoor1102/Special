/**
 * @author  Yash Kapoor
 * @version September 10th, 2021
 */

// Student ID: 101163338

import java.util.ArrayList;

public class AddressBook {

    private ArrayList<BuddyInfo>buddyInfo;

    public AddressBook() {

        this.buddyInfo = new ArrayList<BuddyInfo>();

    }

    public void addBuddy(BuddyInfo bi) {
        for(int i = 0; i < buddyInfo.size(); i++)   {
            if(bi.equals(buddyInfo.get(i))) {
                return;
            }
        }

        buddyInfo.add(bi);
    }

    public void removeBuddy(BuddyInfo bi) {
        for(int i = 0; i < buddyInfo.size(); i++)  {
            if(bi.equals(buddyInfo.get(i))) {
                buddyInfo.remove(bi);
                return;
            }
        }
    }

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Tom", "Carleton", "613-789-9887");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);

    }

}



