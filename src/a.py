

def calculate_average(numbers):
    
    total = sum(numbers)
    return total / len(numbers)

def greet_user(user_info):
   
    print(f"Hello, {user_info['name']}! The time is {time}.")

def append_to_list(value, current_list=[]):
    
    current_list.append(value)
    return current_list




result = "The answer is: " + 42
print(result)


print(calculate_average([]))


greet_user({"age": 30})


print(append_to_list(1))  
print(append_to_list(2))  
