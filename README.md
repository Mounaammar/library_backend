# library_backend


#### To add some data before running the application => run the two APIs below in Postman
-----------------
## 1/ add some authors :
#### URL : POST http://localhost:8080/authors
#### data:
```json

[
    {
        "name":"Delia Owens"
    },
      {
        "name":"Lisa Jewel"
    },  {
        "name":"Richard Osman"
    },  {
        "name":"Matt Hig"
    },  {
        "name":"Lindsey Davis" 
    },  {
        "name":"Michael Punke"
    },  {
        "name": "Diana Gabaldon"
    },  {
        "name":"Stephen King"
    }
]
```
-----------------
 ## 2/ add some books:
#### URL:http://localhost:8080/books
#### data: 
```json
[{
    "title": "Mr Mercedes", 
    "cover": "assets/img/photo8.jpg", 
    "author": 
    { "name": "Stephen King" },
     "description": "This is where we begin, in Matt Haig's new novel, The Midnight Library: with a young woman on the verge of making a terrible choice. She's lost her job, her best friend, her brother. Her relationships are in shambles and her cat is dead. More importantly, she is just deeply, seemingly irretrievably, sad. She can't imagine a day that is better with her in it. Living has become nothing but a chore.So she ends it. Overdose. Antidepressants. The world goes black.And then Nora wakes up. Not in heaven (dull) or hell (overdone) or purgatory (insert Lost joke), but in a library. The Midnight Library, which is the place people go when they find themselves hanging precariously between life and death and not entirely sure about which way to go." 
 },
 {
    "title": "Written in my own heart's blood", 
    "cover": "assets/img/photo7.jpg", 
    "author": 
    { "name": "Diana Gabaldon" },
     "description": "This is where we begin, in Matt Haig's new novel, The Midnight Library: with a young woman on the verge of making a terrible choice. She's lost her job, her best friend, her brother. Her relationships are in shambles and her cat is dead. More importantly, she is just deeply, seemingly irretrievably, sad. She can't imagine a day that is better with her in it. Living has become nothing but a chore.So she ends it. Overdose. Antidepressants. The world goes black.And then Nora wakes up. Not in heaven (dull) or hell (overdone) or purgatory (insert Lost joke), but in a library. The Midnight Library, which is the place people go when they find themselves hanging precariously between life and death and not entirely sure about which way to go." 
 },
 {
    "title": "The Revenant", 
    "cover": "assets/img/photo6.jpg", 
    "author": 
    { "name": "Michael Punke" },
     "description": "This is where we begin, in Matt Haig's new novel, The Midnight Library: with a young woman on the verge of making a terrible choice. She's lost her job, her best friend, her brother. Her relationships are in shambles and her cat is dead. More importantly, she is just deeply, seemingly irretrievably, sad. She can't imagine a day that is better with her in it. Living has become nothing but a chore.So she ends it. Overdose. Antidepressants. The world goes black.And then Nora wakes up. Not in heaven (dull) or hell (overdone) or purgatory (insert Lost joke), but in a library. The Midnight Library, which is the place people go when they find themselves hanging precariously between life and death and not entirely sure about which way to go." 
 },
 {
    "title": "Deadly Election", 
    "cover": "assets/img/photo5.jpg", 
    "author": 
    { "name": "Lindsey Davis" },
     "description": "This is where we begin, in Matt Haig's new novel, The Midnight Library: with a young woman on the verge of making a terrible choice. She's lost her job, her best friend, her brother. Her relationships are in shambles and her cat is dead. More importantly, she is just deeply, seemingly irretrievably, sad. She can't imagine a day that is better with her in it. Living has become nothing but a chore.So she ends it. Overdose. Antidepressants. The world goes black.And then Nora wakes up. Not in heaven (dull) or hell (overdone) or purgatory (insert Lost joke), but in a library. The Midnight Library, which is the place people go when they find themselves hanging precariously between life and death and not entirely sure about which way to go." 
 },
 {
    "title": "The midnight Library", 
    "cover": "assets/img/photo4.jpg", 
    "author": 
    { "name": "Matt Hig" },
     "description": "This is where we begin, in Matt Haig's new novel, The Midnight Library: with a young woman on the verge of making a terrible choice. She's lost her job, her best friend, her brother. Her relationships are in shambles and her cat is dead. More importantly, she is just deeply, seemingly irretrievably, sad. She can't imagine a day that is better with her in it. Living has become nothing but a chore.So she ends it. Overdose. Antidepressants. The world goes black.And then Nora wakes up. Not in heaven (dull) or hell (overdone) or purgatory (insert Lost joke), but in a library. The Midnight Library, which is the place people go when they find themselves hanging precariously between life and death and not entirely sure about which way to go." 
 },
 {
    "title": "The thuersday Murder", 
    "cover": "assets/img/photo3.jpg", 
    "author": 
    { "name": "Richard Osman" },
     "description": "This is where we begin, in Matt Haig's new novel, The Midnight Library: with a young woman on the verge of making a terrible choice. She's lost her job, her best friend, her brother. Her relationships are in shambles and her cat is dead. More importantly, she is just deeply, seemingly irretrievably, sad. She can't imagine a day that is better with her in it. Living has become nothing but a chore.So she ends it. Overdose. Antidepressants. The world goes black.And then Nora wakes up. Not in heaven (dull) or hell (overdone) or purgatory (insert Lost joke), but in a library. The Midnight Library, which is the place people go when they find themselves hanging precariously between life and death and not entirely sure about which way to go." 
 },
 {
    "title": "The family upstairs", 
    "cover": "assets/img/photo2.jpg", 
    "author": 
    { "name": "Lisa Jewel" },
     "description": "This is where we begin, in Matt Haig's new novel, The Midnight Library: with a young woman on the verge of making a terrible choice. She's lost her job, her best friend, her brother. Her relationships are in shambles and her cat is dead. More importantly, she is just deeply, seemingly irretrievably, sad. She can't imagine a day that is better with her in it. Living has become nothing but a chore.So she ends it. Overdose. Antidepressants. The world goes black.And then Nora wakes up. Not in heaven (dull) or hell (overdone) or purgatory (insert Lost joke), but in a library. The Midnight Library, which is the place people go when they find themselves hanging precariously between life and death and not entirely sure about which way to go." 
 },
  {
    "title": "Where the crawdads sing", 
    "cover": "assets/img/photo1.jpg", 
    "author": 
    { "name": "Delia Owens" },
     "description": "This is where we begin, in Matt Haig's new novel, The Midnight Library: with a young woman on the verge of making a terrible choice. She's lost her job, her best friend, her brother. Her relationships are in shambles and her cat is dead. More importantly, she is just deeply, seemingly irretrievably, sad. She can't imagine a day that is better with her in it. Living has become nothing but a chore.So she ends it. Overdose. Antidepressants. The world goes black.And then Nora wakes up. Not in heaven (dull) or hell (overdone) or purgatory (insert Lost joke), but in a library. The Midnight Library, which is the place people go when they find themselves hanging precariously between life and death and not entirely sure about which way to go." 
 }
]
```
