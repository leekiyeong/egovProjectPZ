module pz {
	exports pz.controller;
	exports file;
	exports pz.service;
	exports map;
	exports pz.configuration;
	exports pz.mapper;
	exports pz.vo;

	requires com.fasterxml.jackson.core;
	requires com.fasterxml.jackson.databind;
	requires commons.dbcp2;
	requires java.management;
	requires java.servlet;
	requires java.sql;
	requires json.simple;
	requires lombok;
	requires org.apache.httpcomponents.httpclient;
	requires org.apache.httpcomponents.httpcore;
	requires org.mybatis;
	requires org.mybatis.spring;
	requires org.slf4j;
	requires spring.beans;
	requires spring.context;
	requires spring.core;
	requires spring.jdbc;
	requires spring.tx;
	requires spring.web;
	requires spring.webmvc;
}