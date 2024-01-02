<p align="center">
<img src="https://i.postimg.cc/rshx3FKM/Enterprise-Digital-Technology-Services-EDTS.png" alt="EDTS" title="EDTS" width="300"/>
</p>

EDTS iOS Base Skeleton was developed by PT. Elevenia Digital Teknologi Sukses for internal uses only. This base skeleton is used as a standard in developing new applications. With this, every developer will have the same understanding to develop or maintain the application.

## Features

- [x] Swift 5 Support
- [x] Based on Clean Architecture
- [x] MVVM Design Pattern
- [x] RXSwift Support
- [x] Xib UI Layout
- [x] CoreData Support 
- [x] Multiple Deployment Environment

## EDTS App Architecture & Design Pattern 
<p align="center">
<img src="https://i.postimg.cc/J4H7xpnb/Architecture.png"/>
</p>

The Image shown above is the EDTS Design Pattern Flow. It's divided into 3 layers. The first layer is Presentation, consisting of the View Controller and View Model; the second layer is Domain, consisting of the Use Case; the third layer is Data, consisting of the Repository and Service. 

1. **Presentation Layer:**

- This is the first layer, responsible for handling the user interface and user interactions.
- Components in this layer include View Controllers, View Models, and UI elements (like XIB files or storyboards).
- The View Controller is responsible for managing the UI and handling user input. When a user interacts with the app, the View Controller captures the input and forwards it to the View Model.
- The View Model processes the input and prepares data for presentation. It may also contain presentation logic.
- UI elements (XIBs or storyboards) define the layout and appearance of the user interface.

2. **Domain Layer:**

- This layer is in the middle and contains the core business logic and use cases.
- The main component in this layer is the Use Case, which represents specific application scenarios and business operations.
- The Use Case interacts with the Repository to perform data operations. It does not concern itself with how data is stored or where it comes from; it simply defines the business rules and operations.
- The Use Case can request data from the Repository, perform operations on that data, and provide the results to the Presentation Layer.

3. **Data Layer:**

- This is the third layer and is responsible for data access and storage.
- Components in this layer include the Repository and external services (e.g., network services).
- The Repository acts as an interface for data access and manipulation. It defines methods for fetching, storing, and managing data without specifying the data source (e.g., database, API).
- The Repository interacts with the Service to fetch data from external sources (e.g., making API requests to a server) or communicates directly with data sources if they are local (e.g., a local database).
- The Service handles communication with external systems, abstracting away the details of network requests, authentication, and other external dependencies.

**Flow of Control and Data:**

1. User interactions or events trigger actions in the Presentation Layer (View Controller).
2. The View Controller forwards these actions or user input to the View Model.
3. The View Model processes the input, which may involve making requests to the Use Case in the Domain Layer.
4. The Use Case contains the application's business logic and may request data from the Repository.
5. The Repository interacts with external services via the Service or accessing local data sources.
6. Data is retrieved or manipulated by the Repository and sent back to the Use Case.
7. The Use Case processes the data and sends the results back to the View Model.
8. The View Model prepares the data for presentation and sends it to the View Controller.
9. The View Controller updates the UI with the data received from the View Model, providing feedback to the user.

This separation of layers helps make the codebase more modular, testable, and maintainable. It allows for changes in one layer without affecting the others, making it easier to adapt the application to evolving requirements or technologies. Additionally, it facilitates unit testing, as each layer can be tested in isolation from the others.

## Folder Structure

This base project has a primary folder structure to separate files and code based on its functionality in the project. The folders are as follows:

1. Cores
3. Commons
4. Modules
5. Resources

#### Cores

The Cores folder contains the core model or function of the application. It has subfolders such as Base, Data, DI, Domains, Enum, Utils/Helper, Extensions, etc.

1. The Base folder consists of BaseViewController, BaseViewModel, BaseService, and others that can be used as the parent of the class.
2. The Data folder consist of repository folder as a router class to access local storage (e.g. CoreData) or API Services. Every time an application needs to send a request or get a response from API Service, the data should be passed through the repository class and returned using protocols.
3. The DI (Dependency Injector) folder consist of dependency injector for each modules you have in the project. <sup>__*__</sup>
4. The Domains folder has 2 folders inside. Entities and UseCases folder.<sup>__**__</sup>
5. The Enum folder, contains  constants and enumerations that define app-wide constants, such as API endpoints, notification names, or error codes.
6. The Utils/Helper folder contains utility classes or helper functions that are used throughout your app. These can include any code that provides common functionality. (e.g., DateFormatter, Currency)
8. The Extensions folder keeps Swift code files that provide additional capabilities to existing Swift or UIKit classes. These extensions allow you to enhance the functionality of standard classes or your custom types. You can organize extensions by the class they extend (e.g., Extension+UIImageView, Extension+UITapGestureRecognizer).

__* Notes:__
- Dependency injection helps your code more modular, testable, and maintainable. It's a way of providing the dependencies (i.e., objects or services) that a class needs from the outside, rather than having the class create them itself. This makes your code more flexible because you can easily replace or modify dependencies without changing the class that uses them.

__** Notes:__
- Entities are the core objects, the nouns, in your application. The Struct is an object that can be used as a JSON request to the API server. (e.g., LoginRequest)
- Use Cases are the actions or operations, the verbs, that your application can perform on these entities.

#### Commons

The Common folder or directory purpose is to house custom UI elements, or other reusable code that can be utilized throughout the app. With this, it'll make it easier to locate and maintain code that is shared across different parts of your app. It also enhances code reusability and reduces the risk of duplication, leading to a more maintainable, organizable, and efficient codebase.

#### Modules

The Modules folder is where the presentation of the application are separated based on what kind of view is displayed (e.g., Login, Home, Cart)

1. The Views folder contains Xib, UIViewController, UITableViewCell, UICollectionViewCell, etc.
2. The ViewModels folder contains the presentation logic for a specific screen or view. It encapsulates data formatting, transformation, and often exposes properties that the view can bind to, making it responsible for preparing and providing data for display in the user interface.

#### Resources

This folder holds static files and resources used by the application. These assets are typically not code but are essential for the application's functionality. This folder typically stores non-code assets such as images, icons, fonts, and stylesheets, making them easily accessible to the application. This folder also keeps configuration files, plists, or settings that are used to configure various aspects of your app.

## Implementation

This base project can be used by copying the whole project to a new finder directory or Git repository and changing the Bundle ID and other application information.

### Cocoapods

Make sure that before opening the project, cocoapods are already installed, and install a few of the dependencies by changing the podfile.

```
def shared_pod
 pod 'RxSwift'
  pod 'RxCocoa'
  pod 'Alamofire', '5.4.4'
  pod 'lottie-ios'
  pod 'Kingfisher'
  pod 'ShimmerSwift'
  pod 'SwiftMessages'
  pod 'SecureDefaults', '1.0.7'
  pod 'Firebase/Crashlytics'
  pod 'Firebase/Analytics'
  pod 'Firebase/Messaging'
  pod 'Firebase/RemoteConfig'
  pod 'Firebase/Crashlytics'
  pod 'Firebase/Analytics'
  pod 'Popover'
  pod 'SwiftyRSA'

  pod 'EDTSTracker', '1.0.9'
  pod 'EDTSUI
end
```

Note: Different commands exist to install cocoapods using a Macbook with an Apple M1 processor.

```
# Install ffi
sudo arch -x86_64 gem install ffi

# Reinstall dependencies
arch -X86_64 pod install

# Uninstall the local cocoapods gem
sudo gem uninstall cocoapods

# Reinstall cocoapods via Homebrew
brew install cocoapods
```

Note: The project also has different configurations when using a Macbook with an Apple M1 processor and XCode 13 or the latest. 

<p align="center">
<img src="https://i.postimg.cc/1X8y1wSW/Screen-Shot-2022-04-21-at-15-33-33.png" alt="EDTS" title="EDTS" width="800"/>
</p>

1. Every Pod that got an error when archiving the project needs changes in build settings.
2. To change the Pod configuration, open Pod Target inside Pod Project and the build settings tab.
3. Swift Compiler - Code Generation - Compilation Mode Debug/Release should be changed to Incremental.
4. Swift Compiler - Code Generation - Optimization Levele Debug/Release should be changed to No Optimization.
5. Every Pod that got an error when archiving the project needs to change the Deployment version to 11
