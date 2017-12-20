package net.jewel.jewelshoppingbe.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import net.jewel.jewelshoppingbe.dao.CategoryDAO;
import net.jewel.jewelshoppingbe.dto.Category;

public class CategoryTestCase {

	private static AnnotationConfigApplicationContext context;

	private static CategoryDAO;

	private Category category;

	@Beforeclass
	public static void init() {

		context = new AnnotationConfigApplicationContext();
		context.scan("net.jewel.jewelshoppingbe");
		context.refresh();
		categoryDAO = (CategoryDAO) context.getBean("categoryDAO");

	}

	@Test
	public void testAddCategory() {
		category = new Category();
		
		category.setName("Necklace");
		category.setDescription("Stunning Stylish Neckpiece!");
		category.setImageurl("CAT_1.png");
		
		assertEquals("Successfully added!", true,categoryDAO.add(category))
	
	}
}
