package US06;

public class us06 {
  @Test
    public void DropDownMenu() {
        PageHome ph = new PageHome();

        String currentUrl=driver.getCurrentUrl();
        System.out.println("currentUrl = " + currentUrl);
        for (int i = 0; i < ph.allLinks.size(); i++) {
            ph.allLinks = driver.findElements(By.xpath("//a"));
            if (!ph.allLinks.get(i).getText().equals("Campus Login") && ph.allLinks.get(i).isDisplayed()){
                System.out.println("ph.allLinks.get(i).getText() = " + ph.allLinks.get(i).getText());
                ph.myClick(ph.allLinks.get(i));}
            ph.myClick(ph.logoLink);
            ph.locationVerification(ph.applyButton);
        }

  
}
