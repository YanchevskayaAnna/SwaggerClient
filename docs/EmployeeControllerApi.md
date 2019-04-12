# EmployeeControllerApi

All URIs are relative to *https://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**allUsingGET**](EmployeeControllerApi.md#allUsingGET) | **GET** /employees | get all employees
[**newEmployeeUsingPOST**](EmployeeControllerApi.md#newEmployeeUsingPOST) | **POST** /employees | create new employee
[**oneUsingGET**](EmployeeControllerApi.md#oneUsingGET) | **GET** /employees/{id} | get information about employee by id


<a name="allUsingGET"></a>
# **allUsingGET**
> List&lt;Employee&gt; allUsingGET()

get all employees

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.EmployeeControllerApi;


EmployeeControllerApi apiInstance = new EmployeeControllerApi();
try {
    List<Employee> result = apiInstance.allUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmployeeControllerApi#allUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Employee&gt;**](Employee.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="newEmployeeUsingPOST"></a>
# **newEmployeeUsingPOST**
> Employee newEmployeeUsingPOST(newEmployee)

create new employee

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.EmployeeControllerApi;


EmployeeControllerApi apiInstance = new EmployeeControllerApi();
Employee newEmployee = new Employee(); // Employee | newEmployee
try {
    Employee result = apiInstance.newEmployeeUsingPOST(newEmployee);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmployeeControllerApi#newEmployeeUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **newEmployee** | [**Employee**](Employee.md)| newEmployee |

### Return type

[**Employee**](Employee.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="oneUsingGET"></a>
# **oneUsingGET**
> Employee oneUsingGET(id)

get information about employee by id

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.EmployeeControllerApi;


EmployeeControllerApi apiInstance = new EmployeeControllerApi();
Long id = 789L; // Long | id
try {
    Employee result = apiInstance.oneUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmployeeControllerApi#oneUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id |

### Return type

[**Employee**](Employee.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

