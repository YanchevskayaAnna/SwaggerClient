# AddressControllerApi

All URIs are relative to *https://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAddressUsingPOST**](AddressControllerApi.md#createAddressUsingPOST) | **POST** /employees/{employeeId}/addresses | create new address
[**getAllAddressesByEmployeeIdUsingGET**](AddressControllerApi.md#getAllAddressesByEmployeeIdUsingGET) | **GET** /employees/{employeeId}/addresses | get all addresses by employee id


<a name="createAddressUsingPOST"></a>
# **createAddressUsingPOST**
> Address createAddressUsingPOST(address, employeeId)

create new address

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AddressControllerApi;


AddressControllerApi apiInstance = new AddressControllerApi();
Address address = new Address(); // Address | address
Long employeeId = 789L; // Long | employeeId
try {
    Address result = apiInstance.createAddressUsingPOST(address, employeeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AddressControllerApi#createAddressUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **address** | [**Address**](Address.md)| address |
 **employeeId** | **Long**| employeeId |

### Return type

[**Address**](Address.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getAllAddressesByEmployeeIdUsingGET"></a>
# **getAllAddressesByEmployeeIdUsingGET**
> List&lt;Address&gt; getAllAddressesByEmployeeIdUsingGET(employeeId)

get all addresses by employee id

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AddressControllerApi;


AddressControllerApi apiInstance = new AddressControllerApi();
Long employeeId = 789L; // Long | employeeId
try {
    List<Address> result = apiInstance.getAllAddressesByEmployeeIdUsingGET(employeeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AddressControllerApi#getAllAddressesByEmployeeIdUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **employeeId** | **Long**| employeeId |

### Return type

[**List&lt;Address&gt;**](Address.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

