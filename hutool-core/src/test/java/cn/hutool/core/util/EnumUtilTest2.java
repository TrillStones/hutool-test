package cn.hutool.core.util;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class EnumUtilTest2 {

	@Test
	public void testIsEnum() throws Exception {
		boolean result = EnumUtil.isEnum(null);
		Assert.assertEquals(true, result);
	}

	@Test
	public void testIsEnum2() throws Exception {
		boolean result = EnumUtil.isEnum("obj");
		Assert.assertEquals(true, result);
	}

	@Test
	public void testToString() throws Exception {
		String result = EnumUtil.toString(null);
		Assert.assertEquals("replaceMeWithExpectedResult", result);
	}

	public enum AB{
		A,B
	}
	@Test
	public void testGetEnumAt() throws Exception {
		AB result = EnumUtil.getEnumAt(AB.class, 0);
		Assert.assertEquals(AB.A, result);
	}

	@Test
	public void testFromString() throws Exception {
		AB result = EnumUtil.fromString(AB.class, "A");
		Assert.assertEquals(AB.A, result);
	}
//
//	@Test
//	public void testFromString2() throws Exception {
//		E result = EnumUtil.fromString(null, "value", new E());
//		Assert.assertEquals(new E(), result);
//	}
//
//	@Test
//	public void testFromStringQuietly() throws Exception {
//		E result = EnumUtil.fromStringQuietly(null, "value");
//		Assert.assertEquals(new E(), result);
//	}
//
//	@Test
//	public void testLikeValueOf() throws Exception {
//		E result = EnumUtil.likeValueOf(null, "value");
//		Assert.assertEquals(new E(), result);
//	}

	@Test
	public void testGetNames() throws Exception {
		List<String> result = EnumUtil.getNames(null);
		Assert.assertEquals(Arrays.<String>asList("String"), result);
	}

	@Test
	public void testGetFieldValues() throws Exception {
		List<Object> result = EnumUtil.getFieldValues(null, "fieldName");
		Assert.assertEquals(Arrays.<Object>asList("replaceMeWithExpectedResult"), result);
	}

	@Test
	public void testGetFieldNames() throws Exception {
		List<String> result = EnumUtil.getFieldNames(null);
		Assert.assertEquals(Arrays.<String>asList("String"), result);
	}

//	@Test
//	public void testGetBy() throws Exception {
//		E result = EnumUtil.getBy(null, null);
//		Assert.assertEquals(new E(), result);
//	}
//
//	@Test
//	public void testGetBy2() throws Exception {
//		E result = EnumUtil.getBy(null, new C());
//		Assert.assertEquals(new E(), result);
//	}
//
//	@Test
//	public void testGetBy3() throws Exception {
//		E result = EnumUtil.getBy(null, new C(), new E());
//		Assert.assertEquals(new E(), result);
//	}
//
//	@Test
//	public void testGetFieldBy() throws Exception {
//		F result = EnumUtil.getFieldBy(null, null, new C());
//		Assert.assertEquals(new F(), result);
//	}

//	@Test
//	public void testGetEnumMap() throws Exception {
//		LinkedHashMap<String, E> result = EnumUtil.getEnumMap(null);
//		Assert.assertEquals(null, result);
//	}

	@Test
	public void testGetNameFieldMap() throws Exception {
		Map<String, Object> result = EnumUtil.getNameFieldMap(null, "fieldName");
		Assert.assertEquals(new HashMap<String, Object>() {{
			put("String", "replaceMeWithExpectedResult");
		}}, result);
	}

	@Test
	public void testContains() throws Exception {
		boolean result = EnumUtil.contains(null, "val");
		Assert.assertEquals(true, result);
	}

	@Test
	public void testNotContains() throws Exception {
		boolean result = EnumUtil.notContains(null, "val");
		Assert.assertEquals(true, result);
	}

	@Test
	public void testEqualsIgnoreCase() throws Exception {
		boolean result = EnumUtil.equalsIgnoreCase(null, "val");
		Assert.assertEquals(true, result);
	}

	@Test
	public void testEquals() throws Exception {
		boolean result = EnumUtil.equals(null, "val");
		Assert.assertEquals(true, result);
	}
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme
