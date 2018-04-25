import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;
import java.util.regex.Matcher;

import org.openqa.selenium.JavascriptExecutor;


public class FilterCheck {

    private WebDriver browser;

    @BeforeTest
    public void openBrowser() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver.exe");
        browser = new ChromeDriver();
        browser.get("https://dev.ingarage.ua/poisk.html");
    }

    @AfterTest
    public void closeBrowser() {
        browser.quit();
    }


    @Test
    public void test_1() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("CD-чейнджер");
    }

    @Test
    public void test_2() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("АБС и датчики");
    }

    @Test
    public void test_3() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Абсорбер бампера заднего");
    }

    @Test
    public void test_4() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Абсорбер бампера переднего");
    }


    @Test
    public void test_5() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Абсорбер паров топлива");
    }


    @Test
    public void test_6() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("АКПП");
    }

    @Test
    public void test_7() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Активатор замка багажника");
    }

    @Test
    public void test_8() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Активатор замка двери");
    }

    @Test
    public void test_9() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Активатор замка двери сдвижной правой");
    }

    @Test
    public void test_10() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Актуатор (привод) дроссельной заслонки");
    }

    @Test
    public void test_11() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Актуатор впускного коллектора");
    }

    @Test
    public void test_12() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Актуатор круиз-контроля");
    }

    @Test
    public void test_13() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Амортизатор задний");
    }

    @Test
    public void test_14() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Амортизатор задний левый");
    }

    @Test
    public void test_15() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Амортизатор задний правый");
    }

    @Test
    public void test_16() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Амортизатор задний/передний");
    }

    @Test
    public void test_17() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Амортизатор капота");
    }

    @Test
    public void test_18() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Амортизатор крышки багажника");
    }

    @Test
    public void test_19() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Амортизатор передний");
    }

    @Test
    public void test_20() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Амортизатор передний левый");
    }

    @Test
    public void test_21() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Амортизатор передний правый");
    }

    @Test
    public void test_22() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Антенна");
    }

    @Test
    public void test_23() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Антенна бесключевого доступа");
    }

    @Test
    public void test_24() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Антенна навигатора");
    }

    @Test
    public void test_25() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Бак топливный");
    }

    @Test
    public void test_26() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Балка задняя");
    }

    @Test
    public void test_27() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Балка передняя поперечная");
    }

    @Test
    public void test_28() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Балка передняя продольная");
    }

    @Test
    public void test_29() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Балка подмоторная");
    }

    @Test
    public void test_30() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Бампер задний");
    }

    @Test
    public void test_31() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Бампер передний");
    }

    @Test
    public void test_32() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Барабан тормозной задний");
    }

    @Test
    public void test_33() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Бардачок");
    }

    @Test
    public void test_34() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Бачок вакуумной системы");
    }

    @Test
    public void test_35() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Бачок гидроусилителя");
    }

    @Test
    public void test_36() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Бачок главного тормозного цилиндра");
    }

    @Test
    public void test_37() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Бачок омывателя");
    }

    @Test
    public void test_38() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Бачок расширительный");
    }

    @Test
    public void test_39() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Блок ABS");
    }

    @Test
    public void test_40() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Блок бесключевого доступа");
    }

    @Test
    public void test_41() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Блок иммобилайзера");
    }

    @Test
    public void test_42() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Блок кнопок");
    }

    @Test
    public void test_43() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Блок кнопок стеклоподъемника");
    }

    @Test
    public void test_44() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Блок комфорта");
    }

    @Test
    public void test_45() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Блок предохранителей");
    }

    @Test
    public void test_46() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Блок реле");
    }

    @Test
    public void test_47() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Блок розжига");
    }

    @Test
    public void test_48() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Блок сигнализации");
    }

    @Test
    public void test_49() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Блок согласования фаркопа");
    }

    @Test
    public void test_50() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Блок управления ABS");
    }

    @Test
    public void test_51() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Блок управления AIR BAG (подушками безопасности)");
    }

    @Test
    public void test_52() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Блок управления ESP (стабилизацией движения)");
    }

    @Test
    public void test_53() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Блок управления блокировкой дифференциала");
    }

    @Test
    public void test_54() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Блок управления вентилятором");
    }

    @Test
    public void test_55() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Блок управления двигателем");
    }

    @Test
    public void test_56() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Блок управления камерой заднего вида");
    }

    @Test
    public void test_57() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Блок управления климатом");
    }

    @Test
    public void test_58() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Блок управления коробкой переключения передач (КПП)");
    }

    @Test
    public void test_59() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Блок управления корректором фар");
    }

    @Test
    public void test_60() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Блок управления круиз-контролем");
    }

    @Test
    public void test_61() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Блок управления моторчиком стеклоподъемника передней правой двери");
    }

    @Test
    public void test_62() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Блок управления навигацией");
    }

    @Test
    public void test_63() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Блок управления парктрониками");
    }

    @Test
    public void test_64() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Блок управления печкой");
    }

    @Test
    public void test_65() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Блок управления подвеской");
    }

    @Test
    public void test_66() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Блок управления полным приводом");
    }

    @Test
    public void test_67() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Блок управления редуктором");
    }

    @Test
    public void test_68() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Блок управления центральным замком");
    }

    @Test
    public void test_69() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Блок управления электроусилителем руля");
    }

    @Test
    public void test_70() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Блок цилиндров");
    }

    @Test
    public void test_71() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Бок левый");
    }

    @Test
    public void test_72() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Бок правый");
    }

    @Test
    public void test_73() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Болт головки блока цилиндров");
    }

    @Test
    public void test_74() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Болт коленвала");
    }

    @Test
    public void test_75() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Болт колесный");
    }

    @Test
    public void test_76() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Болт крепления запасного колеса");
    }

    @Test
    public void test_77() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Болт крепления шаровой опоры");
    }

    @Test
    public void test_78() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Болт переднего амортизатора");
    }

    @Test
    public void test_79() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Болт распредвала");
    }

    @Test
    public void test_80() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Болт форсунки");
    }

    @Test
    public void test_81() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Брызговик задний левый");
    }

    @Test
    public void test_82() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Брызговик задний правый");
    }

    @Test
    public void test_83() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Бугеля (крепление) коленвала");
    }

    @Test
    public void test_84() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Бугеля (крепление) распредвала");
    }

    @Test
    public void test_85() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Вал карданный (кардан)");
    }

    @Test
    public void test_86() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Вал карданный (кардан) задний");
    }

    @Test
    public void test_87() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Вал карданный (кардан) передний");
    }

    @Test
    public void test_88() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Вал колонки рулевой");
    }

    @Test
    public void test_89() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Вентилятор печки");
    }

    @Test
    public void test_90() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Вентилятор радиатора");
    }

    @Test
    public void test_91() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Вилка сцепления");
    }

    @Test
    public void test_92() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Вискомуфта вентилятора");
    }

    @Test
    public void test_93() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Вкладыш зеркала левого");
    }

    @Test
    public void test_94() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Вкладыш зеркала правого");
    }

    @Test
    public void test_95() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Вкладыши коренные");
    }

    @Test
    public void test_96() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Вкладыши шатунные");
    }

    @Test
    public void test_97() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Водосток лобового стекла");
    }

    @Test
    public void test_98() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Воздуховод воздушного фильтра");
    }

    @Test
    public void test_99() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("");
    }

    @Test
    public void test_100() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Воздуховод впускного коллектора");
    }

    @Test
    public void test_101() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Воздуховод интеркулера");
    }

    @Test
    public void test_102() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Воздуховод обогрева лобового стекла");
    }

    @Test
    public void test_103() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Воздуховод обогрева салона");
    }

    @Test
    public void test_104() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Воздуховод обогрева салона боковой левый");
    }

    @Test
    public void test_105() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Воздуховод обогрева салона боковой правый");
    }

    @Test
    public void test_106() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Воздуховод обогрева салона верхний левый");
    }

    @Test
    public void test_107() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Воздуховод обогрева салона нижний левый");
    }

    @Test
    public void test_108() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Воздуховод обогрева салона центральный");
    }

    @Test
    public void test_109() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Воздуховод обогрева салона центральный левый");
    }

    @Test
    public void test_110() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Воздуховод обогрева салона центральный правый");
    }

    @Test
    public void test_111() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Воздуховод радиатора двигателя");
    }

    @Test
    public void test_112() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Воздуховод турбины");
    }

    @Test
    public void test_113() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Воздушный фильтр");
    }

    @Test
    public void test_114() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Втулка");
    }

    @Test
    public void test_115() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Выключатель");
    }

    @Test
    public void test_116() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Гайка колесная");
    }

    @Test
    public void test_117() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Генератор");
    }

    @Test
    public void test_118() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Главный цилиндр сцепления");
    }

    @Test
    public void test_119() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Глушитель");
    }

    @Test
    public void test_120() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Глушитель (конечная часть)");
    }

    @Test
    public void test_121() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Глушитель (передняя часть)");
    }

    @Test
    public void test_122() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Глушитель (средняя часть)");
    }

    @Test
    public void test_123() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Гнездо прикуривателя");
    }

    @Test
    public void test_124() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Головка блока цилиндров");
    }

    @Test
    public void test_125() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Горловина маслозаливная");
    }

    @Test
    public void test_126() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Горловина топливного бака");
    }

    @Test
    public void test_127() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Датчик");
    }

    @Test
    public void test_128() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("");
    }

    @Test
    public void test_129() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Датчик ABS задний");
    }

    @Test
    public void test_130() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Датчик ABS задний левый");
    }

    @Test
    public void test_131() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Датчик ABS задний правый");
    }

    @Test
    public void test_132() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Датчик ABS передний");
    }

    @Test
    public void test_133() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Датчик ABS передний левый");
    }

    @Test
    public void test_134() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Датчик ABS передний правый");
    }

    @Test
    public void test_135() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Датчик AIR BAG (левый)");
    }

    @Test
    public void test_136() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Датчик AIR BAG (подушек безопасности)");
    }

    @Test
    public void test_137() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Датчик AIR BAG(правый)");
    }

    @Test
    public void test_138() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Датчик абсолютного давления воздуха");
    }

    @Test
    public void test_139() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Датчик давления");
    }

    @Test
    public void test_140() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Датчик давления выхлопных газов");
    }

    @Test
    public void test_141() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Датчик давления масла");
    }

    @Test
    public void test_142() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Датчик давления топлива");
    }

    @Test
    public void test_143() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Датчик давления топлива в рейке");
    }

    @Test
    public void test_144() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Датчик детонации");
    }

    @Test
    public void test_145() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Датчик заднего хода");
    }

    @Test
    public void test_146() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Датчик качества воздуха");
    }

    @Test
    public void test_147() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Датчик кислорода (лямбда-зонд)");
    }

    @Test
    public void test_148() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Датчик кондиционера");
    }

    @Test
    public void test_149() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Датчик обнаружения ключа");
    }

    @Test
    public void test_150() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Датчик осушителя кондиционера");
    }

    @Test
    public void test_151() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Датчик парковки");
    }

    @Test
    public void test_152() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Датчик педали газа");
    }

    @Test
    public void test_153() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Датчик педали сцепления");
    }

    @Test
    public void test_154() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Датчик педали тормоза (включения стоп-сигнала)");
    }

    @Test
    public void test_155() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Датчик положения дроссельной заслонки");
    }

    @Test
    public void test_156() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Датчик положения коленвала");
    }

    @Test
    public void test_157() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Датчик положения кузова");
    }

    @Test
    public void test_158() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Датчик положения распредвала");
    }

    @Test
    public void test_159() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Датчик расходомера воздуха");
    }

    @Test
    public void test_160() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Датчик рычага ручного тормоза");
    }

    @Test
    public void test_161() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Датчик света фар");
    }

    @Test
    public void test_162() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Датчик сигнализации");
    }

    @Test
    public void test_163() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Датчик температуры воздуха");
    }

    @Test
    public void test_164() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Датчик температуры выхлопных газов");
    }

    @Test
    public void test_165() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Датчик температуры катализатора");
    }

    @Test
    public void test_166() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Датчик температуры охлаждающей жидкости");
    }

    @Test
    public void test_167() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Датчик температуры топлива");
    }

    @Test
    public void test_168() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Датчик термостата");
    }

    @Test
    public void test_169() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Датчик угла поворота руля");
    }

    @Test
    public void test_170() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Датчик уровня масла");
    }

    @Test
    public void test_171() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Датчик ускорения (ESP)");
    }

    @Test
    public void test_172() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Дверь боковая сдвижная");
    }

    @Test
    public void test_173() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Дверь задняя левая");
    }

    @Test
    public void test_174() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Дверь задняя правая");
    }

    @Test
    public void test_175() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Дверь передняя левая");
    }

    @Test
    public void test_176() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Дверь передняя правая");
    }

    @Test
    public void test_177() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Дверь сдвижная левая");
    }

    @Test
    public void test_178() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Двигатель");
    }

    @Test
    public void test_179() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Дворник задний");
    }

    @Test
    public void test_180() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Дворник передний");
    }

    @Test
    public void test_181() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Дефлектор воздушный");
    }

    @Test
    public void test_182() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Дефлектор воздушный боковой левый");
    }

    @Test
    public void test_183() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Дефлектор воздушный боковой правый");
    }

    @Test
    public void test_184() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Дефлектор воздушный левый");
    }

    @Test
    public void test_185() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Дефлектор воздушный правый");
    }

    @Test
    public void test_186() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Дефлектор воздушный центральный");
    }

    @Test
    public void test_187() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Дефлектор воздушный центральный левый");
    }

    @Test
    public void test_188() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Дефлектор воздушный центральный правый");
    }

    @Test
    public void test_189() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Дефлектор радиатора");
    }

    @Test
    public void test_190() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Дефлектор радиатора верхний");
    }

    @Test
    public void test_191() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Дефлектор радиатора верхний правый");
    }

    @Test
    public void test_192() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Дефлектор радиатора левый");
    }

    @Test
    public void test_193() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Дефлектор радиатора правый");
    }

    @Test
    public void test_194() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Динамик");
    }

    @Test
    public void test_195() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Динамик задний левый");
    }

    @Test
    public void test_196() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Динамик задний правый");
    }

    @Test
    public void test_197() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Динамик передний левый");
    }

    @Test
    public void test_198() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Динамик передний правый");
    }

    @Test
    public void test_199() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Диск колесный алюминиевый R15");
    }

    @Test
    public void test_200() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Диск колесный алюминиевый R16");
    }

    @Test
    public void test_201() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Диск колесный алюминиевый R17");
    }

    @Test
    public void test_202() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Диск колесный железный");
    }

    @Test
    public void test_203() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Диск колесный железный R15");
    }

    @Test
    public void test_204() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Диск колесный железный R16");
    }

    @Test
    public void test_205() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Диск сцепления");
    }

    @Test
    public void test_206() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Диск тормозной задний");
    }

    @Test
    public void test_207() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Диск тормозной передний");
    }

    @Test
    public void test_208() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Диски колесные алюминиевые (комплект) R15");
    }

    @Test
    public void test_209() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Диски колесные алюминиевые (комплект) R16");
    }

    @Test
    public void test_210() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Диски колесные алюминиевые (комплект) R17");
    }

    @Test
    public void test_211() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Диски колесные алюминиевые (комплект) R18");
    }

    @Test
    public void test_212() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Диски колесные алюминиевые (комплект) R19");
    }

    @Test
    public void test_213() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Диски колесные железные (комплект)");
    }

    @Test
    public void test_214() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Диски колесные железные (комплект) R14");
    }

    @Test
    public void test_215() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Диски колесные железные (комплект) R15");
    }

    @Test
    public void test_216() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Диски колесные железные (комплект) R16");
    }

    @Test
    public void test_217() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Дисплей информационный");
    }

    @Test
    public void test_218() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Диффузор вентилятора");
    }

    @Test
    public void test_219() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Диффузор с вентиляторами");
    }

    @Test
    public void test_220() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Диффузор с вентилятором");
    }

    @Test
    public void test_221() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Домкрат");
    }

    @Test
    public void test_222() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Дроссельная заслонка");
    }

    @Test
    public void test_223() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Заглушка двери");
    }

    @Test
    public void test_224() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Заглушка переднего бампера левая");
    }

    @Test
    public void test_225() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Заглушка переднего бампера правая");
    }

    @Test
    public void test_226() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Заглушка салона");
    }

    @Test
    public void test_227() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Заглушка торпедо");
    }

    @Test
    public void test_228() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Замок (блокировка) колонки рулевой");
    }

    @Test
    public void test_229() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Замок двери задней левой");
    }

    @Test
    public void test_230() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Замок двери задней правой");
    }

    @Test
    public void test_231() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Замок двери передней левой");
    }

    @Test
    public void test_232() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Замок двери передней правой");
    }

    @Test
    public void test_234() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Замок двери сдвижной правой");
    }

    @Test
    public void test_235() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Замок зажигания");
    }

    @Test
    public void test_236() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Замок капота");
    }

    @Test
    public void test_237() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Замок крышки багажника");
    }

    @Test
    public void test_238() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Замок лючка бензобака");
    }

    @Test
    public void test_239() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Замок ремня безопасности задний");
    }

    @Test
    public void test_240() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Замок стекла крышки багажника");
    }

    @Test
    public void test_241() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Защита актуатора турбины");
    }

    @Test
    public void test_242() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Защита выпускного коллектора");
    }

    @Test
    public void test_243() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Защита двигателя");
    }

    @Test
    public void test_244() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Защита днища");
    }

    @Test
    public void test_245() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Защита днища кузова левая");
    }

    @Test
    public void test_246() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Защита днища кузова правая");
    }

    @Test
    public void test_247() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Защита запасного колеса задняя");
    }

    @Test
    public void test_248() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Защита катализатора");
    }

    @Test
    public void test_249() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Зеркало левое");
    }

    @Test
    public void test_250() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Зеркало правое");
    }

    @Test
    public void test_251() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Зеркало салона");
    }

    @Test
    public void test_252() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Иммобилайзер");
    }

    @Test
    public void test_253() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Индикатор ремней безопасности");
    }

    @Test
    public void test_254() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Индикатор сигнализации");
    }

    @Test
    public void test_255() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Испаритель кондиционера");
    }

    @Test
    public void test_256() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Камера заднего вида");
    }

    @Test
    public void test_257() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Капот");
    }

    @Test
    public void test_258() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Кардан рулевой");
    }

    @Test
    public void test_259() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Карданный вал");
    }

    @Test
    public void test_260() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Карта двери задней левой");
    }

    @Test
    public void test_261() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Карта двери задней правой");
    }

    @Test
    public void test_262() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Карта двери передней левой");
    }

    @Test
    public void test_263() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Карта двери передней правой");
    }

    @Test
    public void test_264() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Карта крышки багажника");
    }

    @Test
    public void test_265() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Катализатор");
    }

    @Test
    public void test_266() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Катушка зажигания");
    }

    @Test
    public void test_267() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Клапан вакуумный");
    }

    @Test
    public void test_268() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Клапан вентиляции топливного бака");
    }

    @Test
    public void test_269() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Клапан воздушный");
    }

    @Test
    public void test_270() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Клапан головки блока цилиндров впускной");
    }

    @Test
    public void test_271() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Клапан головки блока цилиндров выпускной");
    }

    @Test
    public void test_272() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Клапан отопителя");
    }

    @Test
    public void test_273() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Клапан печки");
    }

    @Test
    public void test_274() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Клапан прокачки сцепления");
    }

    @Test
    public void test_275() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Клапан рециркуляции выхлопных газов (EGR)");
    }

    @Test
    public void test_276() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Клапан ТНВД");
    }

    @Test
    public void test_277() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Клапан турбины");
    }

    @Test
    public void test_278() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Клапан холостого хода");
    }

    @Test
    public void test_279() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Клапан электромагнитный");
    }

    @Test
    public void test_280() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Клемма аккумулятора минус");
    }

    @Test
    public void test_281() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Клемма аккумулятора плюс");
    }

    @Test
    public void test_282() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Клык бампера заднего левый");
    }

    @Test
    public void test_283() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Клык бампера заднего правый");
    }

    @Test
    public void test_284() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Кнопка (регулятор) корректора фар");
    }

    @Test
    public void test_285() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Кнопка AIR BAG");
    }

    @Test
    public void test_286() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Кнопка ASR");
    }

    @Test
    public void test_287() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Кнопка ESP");
    }

    @Test
    public void test_288() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Кнопка аварийного отключения двигателя");
    }

    @Test
    public void test_289() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Кнопка аварийной сигнализации");
    }

    @Test
    public void test_290() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Кнопка блокировки коробки переключения передач");
    }

    @Test
    public void test_291() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Кнопка крышки багажника");
    }

    @Test
    public void test_292() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Кнопка лючка бензобака");
    }

    @Test
    public void test_293() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Кнопка многофункциональная");
    }

    @Test
    public void test_294() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Кнопка обогрева сиденья");
    }

    @Test
    public void test_295() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Кнопка обогрева стекла");
    }

    @Test
    public void test_296() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Кнопка освещения панели приборов");
    }

    @Test
    public void test_297() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Кнопка отсечки топлива");
    }

    @Test
    public void test_298() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Кнопка парктроников");
    }

    @Test
    public void test_299() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Кнопка противотуманных фар");
    }

    @Test
    public void test_300() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Кнопка стеклоподъемника");
    }

    @Test
    public void test_301() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Кнопка стеклоподъемника двери задней левой");
    }

    @Test
    public void test_302() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Кнопка стеклоподъемника двери задней правой");
    }

    @Test
    public void test_303() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Кнопка стеклоподъемника двери передней левой");
    }

    @Test
    public void test_304() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Кнопка стеклоподъемника двери передней правой");
    }

    @Test
    public void test_305() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Кнопка стояночного тормоза");
    }

    @Test
    public void test_306() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Кнопка центрального замка");
    }

    @Test
    public void test_307() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Кнопки руля");
    }

    @Test
    public void test_308() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Коврик багажника");
    }

    @Test
    public void test_309() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Коврик передний");
    }

    @Test
    public void test_310() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Коврик торпедо");
    }

    @Test
    public void test_311() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Ковролин");
    }

    @Test
    public void test_312() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Кожух");
    }

    @Test
    public void test_313() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Кожух ремня ГРМ");
    }

    @Test
    public void test_314() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Кожух рулевой колонки");
    }

    @Test
    public void test_315() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Козырек солнцезащитный левый");
    }

    @Test
    public void test_316() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Козырек солнцезащитный правый");
    }

    @Test
    public void test_317() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Коленвал");
    }

    @Test
    public void test_318() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Колесо запасное (запаска) R14");
    }

    @Test
    public void test_319() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Колесо запасное (запаска) R15");
    }

    @Test
    public void test_320() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Колесо запасное (запаска) R16");
    }

    @Test
    public void test_321() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Коллектор впускной");
    }

    @Test
    public void test_322() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("");
    }

    @Test
    public void test_323() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Коллектор выпускной");
    }

    @Test
    public void test_324() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Колодки тормозные задние");
    }

    @Test
    public void test_325() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Колодки тормозные передние");
    }

    @Test
    public void test_326() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Колонка рулевая");
    }

    @Test
    public void test_327() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Колпак диска");
    }

    @Test
    public void test_328() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Колпак запасного колеса");
    }

    @Test
    public void test_329() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Колпак ступицы");
    }

    @Test
    public void test_330() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Колпаки дисков (комплект)");
    }

    @Test
    public void test_331() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Кольцо поршневое");
    }

    @Test
    public void test_332() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Комплект зажигания");
    }

    @Test
    public void test_333() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Комплект ремня ГРМ");
    }

    @Test
    public void test_334() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Компрессор кондиционера");
    }

    @Test
    public void test_335() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Конденсатор подавления радиопомех");
    }

    @Test
    public void test_336() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Конденсатор радиопередатчика");
    }

    @Test
    public void test_337() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Консоль");
    }

    @Test
    public void test_338() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Консоль кулисы переключения передач");
    }

    @Test
    public void test_339() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Консоль центральная");
    }

    @Test
    public void test_340() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Концевик (выключатель концевой)");
    }

    @Test
    public void test_341() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Корзина сцепления");
    }

    @Test
    public void test_342() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Коробка переключения передач автоматическая (АКПП)");
    }

    @Test
    public void test_343() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Коробка переключения передач механическая (КПП)");
    }

    @Test
    public void test_344() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Коробка раздаточная (раздатка)");
    }

    @Test
    public void test_345() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("Коромысло (рокер) клапана");
    }

    @Test
    public void test_() throws InterruptedException, IllegalArgumentException {
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.test("");
    }











}

