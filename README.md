### Program of Send Notification using SMS or Email service build using Spring dependency injection approach using @Qualifier Annotation to deal with multiple beans

The program showcases a common use case with a messaging interface and two implementations (Email and SMS services). In the controller class, @Qualifier is used to differentiate and inject the EmailMessageService into the emailService field and the SMSMessageService into the smsService field.
#### @Qualifier
The @Qualifier annotation provides a mechanism to specify precisely which bean should be injected during autowiring.
The @Qualifier annotation in Spring is used to resolve ambiguity during dependency injection. When multiple beans of the same type exist in the Spring application context, @Autowired alone cannot determine which specific bean to inject.
