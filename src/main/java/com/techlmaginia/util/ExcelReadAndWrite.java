package com.techlmaginia.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.techlmaginia.model.EnquiryEntity;

public class ExcelReadAndWrite {
	public static String TYPE = "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet";
	static String[] HEADERs = { "fullName", "email", "phoneNo", "organization", "subject", "content", "createdDate" };
	static String SHEET = "Enquiry";

	public static ByteArrayInputStream tutorialsToExcel(List<EnquiryEntity> Emps) {

		try {
			Workbook workbook = new XSSFWorkbook();
			ByteArrayOutputStream out = new ByteArrayOutputStream();
			Sheet sheet = workbook.createSheet(SHEET);

			// Header
			Row headerRow = sheet.createRow(0);

			for (int col = 0; col < HEADERs.length; col++) {
				Cell cell = headerRow.createCell(col);
				cell.setCellValue(HEADERs[col]);
			}
			String edf = new String("dd-MM-yyyy");
			CellStyle cellst = workbook.createCellStyle();
			DataFormat df = workbook.createDataFormat();
			cellst.setDataFormat(((DataFormat) df).getFormat(edf));

			int rowIdx = 1;
			for (EnquiryEntity Emp : Emps) {
				Row row = sheet.createRow(rowIdx++);

				row.createCell(0).setCellValue(Emp.getFullName());
				row.createCell(1).setCellValue(Emp.getEmail());
				row.createCell(2).setCellValue(Emp.getPhoneNo());
				row.createCell(3).setCellValue(Emp.getOrganization());
				row.createCell(4).setCellValue(Emp.getSubject());
				row.createCell(5).setCellValue(Emp.getContent());
				row.createCell(6).setCellValue(Emp.getCreatedDate());
			}

			workbook.write(out);
			return new ByteArrayInputStream(out.toByteArray());
		} catch (IOException e) {
			throw new RuntimeException("fail to import data to Excel file: " + e.getMessage());
		}
	}

	public static ByteArrayInputStream tutorialsToExcel(Iterable<EnquiryEntity> empList) {
		// TODO Auto-generated method stub
		return null;
	}
}
