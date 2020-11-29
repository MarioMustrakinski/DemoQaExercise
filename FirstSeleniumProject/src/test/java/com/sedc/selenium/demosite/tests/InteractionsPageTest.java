package com.sedc.selenium.demosite.tests;

import com.sedc.selenium.demosite.util.Global;
import org.testng.annotations.Test;

public class InteractionsPageTest extends Global {
    String url = "https://demoqa.com/interaction";

    @Test
    public void sortable() throws InterruptedException {
        interactionsPage.navigateTo(url);
        interactionsPage.clickSortable();
        interactionsPage.moveOneList();
        interactionsPage.clickGrid();
        interactionsPage.moveOneGrid();
        Thread.sleep(3000);
    }
    @Test
    public void resizable() throws InterruptedException {
        interactionsPage.navigateTo(url);
        interactionsPage.clickResizable();
        Thread.sleep(2000);
        interactionsPage.resizeMin();
        Thread.sleep(3000);
        interactionsPage.resizeMax();
        Thread.sleep(3000);
    }
    @Test
    public void dropable() throws InterruptedException {
        interactionsPage.navigateTo(url);
        interactionsPage.clickDropable();
        interactionsPage.simpleDrag();
        interactionsPage.acceptDrag();
        interactionsPage.preventPropagation();
        interactionsPage.revertDragable();
        interactionsPage.selectableList();

        Thread.sleep(3000);

    }

}
