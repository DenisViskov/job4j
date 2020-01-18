package ru.job4j.streamapi;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class ProfilesTest {

    @Test
    public void profilesTest() {
        Address first = new Address("NY", "5 avenue", 44, 32);
        Address second = new Address("LA", "8 street", 345, 5);
        Address third = new Address("Chicago", "9 street", 25, 3);
        List<Profile> input = Arrays.asList(new Profile(first),
                new Profile(second),
                new Profile(third));
        List<Address> expect = Arrays.asList(first, second, third);
        List<Address> out = new Profiles().collect(input);
        Assert.assertEquals(expect, out);
    }
}
