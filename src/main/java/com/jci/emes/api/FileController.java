package com.jci.emes.api;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.jci.emes.api.helpers.ExcelExporter;

@RequestMapping("api/v1/files")
@RestController
public class FileController {
	private String fileLocation;

	@PostMapping("/uploadExcelFile")
	public String uploadFile(Model model, MultipartFile file) throws IOException {
	    InputStream in = file.getInputStream();
	    File currDir = new File(".");
	    String path = currDir.getAbsolutePath();
	    fileLocation = path.substring(0, path.length() - 1) + file.getOriginalFilename();
	    FileOutputStream f = new FileOutputStream(fileLocation);
	    int ch = 0;
	    while ((ch = in.read()) != -1) {
	        f.write(ch);
	    }
	    f.flush();
	    f.close();
	    model.addAttribute("message", "File: " + file.getOriginalFilename() 
	      + " has been uploaded successfully!");
	    return "excel";
	}
	
	@GetMapping("download")
	public void downloadExcel(HttpServletResponse response) throws IOException {
		response.setContentType("application/octet-stream");
		String headerKey = "Content-Disposition";
		String headerValue = "attachment; filename=employee.xlsx";
		response.setHeader(headerKey, headerValue);
		List<String> listEmployees = new ArrayList<String>();
		listEmployees.add("Allen");
		listEmployees.add("Calvin");
		listEmployees.add("Cedric");
		
		ExcelExporter exporter = new ExcelExporter(listEmployees);
		exporter.export(response);
	}
	
	private void exportExcel(List<String> list) {
		XSSFWorkbook workbook;
		XSSFSheet sheet;
	}
	
	private void name() {
		
	}
	
	
}
