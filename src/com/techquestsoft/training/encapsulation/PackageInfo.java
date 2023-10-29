package com.techquestsoft.training.encapsulation;

class PackageInfo {
	public static void main(String args[]) {

		Package p = Package.getPackage("java.lang");

		System.out.println("package name: " + p.getName());

		System.out.println("Specification Title: " + p.getSpecificationTitle());
		System.out.println("Specification Vendor: " + p.getSpecificationVendor());
		System.out.println("Specification Version: " + p.getSpecificationVersion());

		System.out.println("Implementaion Title: " + p.getImplementationTitle());
		System.out.println("Implementation Vendor: " + p.getImplementationVendor());
		System.out.println("Implementation Version: " + p.getImplementationVersion());
		System.out.println("Is sealed: " + p.isSealed());
		
		Package p1 = Package.getPackage("com.training.encapsulation");
		System.out.println("package name: " + p1.getName());
		Package p2 = Package.getPackage("com.training.encapsulation.mypack");
		System.out.println("package name: " + p2.getName());
	}
}
