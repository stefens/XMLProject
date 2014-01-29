package main.java.Manager;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.sun.org.apache.xerces.internal.parsers.DOMParser;
import com.sun.org.apache.xpath.internal.NodeSet;

public class DOMTools {

	


 
//	System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
// 
//	NodeList nList = doc.getElementsByTagName("staff");
// 
//	System.out.println("----------------------------");
// 
//	for (int temp = 0; temp < nList.getLength(); temp++) {
// 
//		Node nNode = nList.item(temp);
// 
//		System.out.println("\nCurrent Element :" + nNode.getNodeName());
// 
//		if (nNode.getNodeType() == Node.ELEMENT_NODE) {
// 
//			Element eElement = (Element) nNode;
// 
//			System.out.println("Staff id : " + eElement.getAttribute("id"));
//			System.out.println("First Name : " + eElement.getElementsByTagName("firstname").item(0).getTextContent());
//			System.out.println("Last Name : " + eElement.getElementsByTagName("lastname").item(0).getTextContent());
//			System.out.println("Nick Name : " + eElement.getElementsByTagName("nickname").item(0).getTextContent());
//			System.out.println("Salary : " + eElement.getElementsByTagName("salary").item(0).getTextContent());
// 
//		}
//	}
//    } catch (Exception e) {
//	e.printStackTrace();
//    }
    
	
	
public static Document getDOMFromXMLString(String xml){
		
		Document doc = null;
		try {
			
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			doc = dBuilder.parse(xml);
			doc = dBuilder.parse(new ByteArrayInputStream(xml.getBytes()));
			doc.getDocumentElement().normalize();
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return doc;
	}

	public static Document getDOMFromXMLFile(File xml){
		
		Document doc = null;
		try {
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			doc = dBuilder.parse(xml);
			doc.getDocumentElement().normalize();
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return doc;
	}
	
	public static String getStringFromXPathQuery(String xpathExpression, Document doc){
		XPath xPath =  XPathFactory.newInstance().newXPath();
		String result=null;
		try {
			result = xPath.compile(xpathExpression).evaluate(doc);
		} catch (XPathExpressionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
		 
	public static Node getNodeFromXPathQuery(String xpathExpression, Document doc){
		XPath xPath =  XPathFactory.newInstance().newXPath();
		Node node=null;
		try {
			node = (Node) xPath.compile(xpathExpression).evaluate(doc, XPathConstants.NODE);
		} catch (XPathExpressionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return node;
	}
	
	public static NodeList getNodeListFromXPathQuery(String xpathExpression, Document doc){
		XPath xPath =  XPathFactory.newInstance().newXPath();
		NodeList nodeList=null;
		try {
			nodeList = (NodeList) xPath.compile(xpathExpression).evaluate(doc, XPathConstants.NODESET);
		} catch (XPathExpressionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return nodeList;
	}
	
	public static Object getNodeSetFromXPathQuery(String xpathExpression, Document doc){
		XPath xPath =  XPathFactory.newInstance().newXPath();
		Object nodeSet=null;
		try {
			nodeSet = xPath.compile(xpathExpression).evaluate(doc, XPathConstants.NODESET);
		} catch (XPathExpressionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return nodeSet;
	}
	
	public static void displayNodeList(NodeList nodeList){
		for (int i = 0; i < nodeList.getLength(); i++) {
		    System.out.println(nodeList.item(i).getFirstChild().getNodeValue()); 
		}
	}
	
	public static String nodeListToString(NodeList nodeList){
		String result ="";
		for (int i = 0; i < nodeList.getLength(); i++) {
			result+=nodeList.item(i).getFirstChild().getNodeValue();
			result+="\n";
		}
		return result;
	}
	
	
}
