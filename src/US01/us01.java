package US01;

public class us01 {
  public class us1 extends BaseDriverParameter {

    @Test
    public void TechnoTest()
    {
        driver.get("https://techno.study/tr/");

        WebElement TechnoLogo=driver.findElement(By.xpath("//a[@href='/tr']"));
        TechnoLogo.click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/tr']")));

        Assert.assertTrue(driver.getCurrentUrl().equals("https://techno.study/tr"));

    }
}
