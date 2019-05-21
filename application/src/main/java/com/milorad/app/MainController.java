package com.milorad.app;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class MainController {

	private String testString="A";
	private static String testStaticString="B";



	public static class RequestData{
		private String _testCase;
		private String _ipAddress;
		private String _date;
		private String _data;
		private String testString="c";
		private static String testStaticString="d";

		public String getData() {
			testString.toString();
			testStaticString.toString();

			return _data;
		}

		public String getDate() {

			return _date;
		}

		public String getIpAddress() {

			return _ipAddress;
		}

		public String getTestCase() {

			return _testCase;
		}

		public void setData(String data) {

			_data = data;
		}

		public void setDate(String date) {

			_date = date;
		}

		public void setIpAddress(String ipAddress) {

			_ipAddress = ipAddress;
		}

		public void setTestCase(String testCase) {

			_testCase = testCase;
		}
	}

	private static List<RequestData> REQUEST_LIST = new ArrayList<>();

	@RequestMapping(value ="/ping", method = RequestMethod.GET)
    @ResponseBody
	@ResponseStatus(HttpStatus.OK)
    public String ping(HttpServletRequest request) {
		String testCase = request.getParameter("testCase");
		String data = request.getParameter("data");
		RequestData rd = new RequestData();
		rd.setData(data);
		rd.setDate((new Date()).toString());
		rd.setIpAddress(request.getRemoteAddr());


		rd.setTestCase(testCase);
		REQUEST_LIST.add(rd);
		return "Added";
    }

	@RequestMapping(value ="/getLog", method = RequestMethod.GET)
	@ResponseBody
	@ResponseStatus(HttpStatus.OK)
	public List<RequestData> getList(HttpServletRequest request) {
		return REQUEST_LIST;
	}

	@RequestMapping(value ="/clearLog", method = RequestMethod.GET)
	@ResponseBody
	@ResponseStatus(HttpStatus.OK)
	public String clearLog(HttpServletRequest request) {
		 REQUEST_LIST.clear();
		 return "cleared";
	}


}