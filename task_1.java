@Test
public void checkIsAdultWhenAgeIsMoreThan18True() {
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(19);
	assertEquals("Ожидалось, что пользователю больше 18", true, isAdult);// 
Напиши код здесь
}
