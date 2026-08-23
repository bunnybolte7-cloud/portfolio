-- buggy_test.lua
-- A test file filled with common Lua bugs

local M = {}

-- Bug 1: Global variable typo / undeclared variable access
function M.calculate_total(price, tax)
    local subtotal = price * tax
    totla = subtotal + price  -- 'totla' is an accidental global typo
    return totla
end

-- Bug 2: Off-by-one error and nil index in array traversal
function M.print_items(item_list)
    -- Lua arrays are 1-indexed, starting at 0 causes a nil lookup or skip
    for i = 0, #item_list do
        print("Item " .. i .. ": " .. item_list[i]) 
    end
end

-- Bug 3: Infinite recursion (missing base case)
function M.bad_factorial(n)
    return n * M.bad_factorial(n - 1)
end

-- Bug 4: Attempting to index a nil value
function M.get_user_name(user)
    return user.profile.name -- Throws error if profile or user is nil
end

return M
