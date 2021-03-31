import axios from 'axios'

const demo_URL="http://localhost:8081/users";
class userservice {
   getusers()
   {
       return axios.get(demo_URL)
   }
   createuser(user)
   {
       return axios.post(demo_URL,user);
   }
   getuserbyid(userId)
   {
       return axios.get(demo_URL+'/'+userId);
   }
   updateuser(user,userId)
   {
    return axios.put(demo_URL+'/'+userId,user);
   }
   deleteUser(userId)
   {
       return axios.delete(demo_URL+'/'+userId)
   }
}
export default new userservice()