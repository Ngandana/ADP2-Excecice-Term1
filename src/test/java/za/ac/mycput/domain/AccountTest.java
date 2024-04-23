package za.ac.mycput.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.sql.SQLOutput;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    private Account account1;
    private Account account2;
    private Account account3;
    @BeforeEach
    void setUp() {
        account1 = new Account();
        account2 = new Account();
        account3 = account1;
    }

    @Test
    @Disabled
    public void testGetBalance(){

    }

    @Test
    @Disabled
    public void testIdentity(){
        assertSame(account1, account2);
        System.out.println("Identity Test Passed");
    }

    @Test
    public void testEquality(){
        assertEquals(account1, account3);
        System.out.println("Account 3 is actually Account1\nTest passed");
    }
}