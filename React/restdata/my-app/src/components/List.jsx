import React, { Component } from 'react'
import userservice from '../services/userservice'

export default class List extends Component {
   
   constructor(props)
   {
       super(props)
       this.state={
           users:[]
       }
       this.addUser= this.addUser.bind(this);
       this.updateUser=this.updateUser.bind(this);
       this.deleteUser=this.deleteUser.bind(this);
   }
   
   
   componentDidMount(){
       userservice.getusers().then((res)=>{
           this.setState({users :res.data});
       });
   }
   deleteUser(id){
   userservice.deleteUser(id).then(res=>{
       this.setState({users:this.state.users.filter(user=>user.id !== id)});
       console.log("nkjcvwv")
   });
   }
   addUser()
   {
       this.props.history.push('/add-user');
   }
   updateUser(id){
    this.props.history.push(`/update-user/${id}`);
   }

    render() {
        return (
            <div>
                <h2 className="text-center mt-4 " >Employee List</h2>
                <div className ="row">
                    <button className="btn btn-primary btn-large" onClick={this.addUser}>Add</button>
                </div>

            <div className="row  container-fluid">
                <table className='table table-striped table-bordered'>
                    <thead>
                    <tr>
                        <th>id</th>
                        <th>username</th>
                        <th>password</th>
                        <th>firstname</th>
                        <th>lastname</th>
                        <th>Actions</th>
                    </tr>
                    </thead>
                    <tbody>
                        {
                            this.state.users.map(
                                user=>
                                <tr key={user.id}>
                                    <td>{user.id}</td>
                                    <td>{user.username}</td>
                                    <td>{user.password}</td>
                                    <td>{user.firstname}</td>
                                    <td>{user.lastname}</td>
                                    <td>
                                    <button className="btn btn-info btn-large" onClick={()=>this.updateUser(user.id)}>update</button>
                                    <button className="btn btn-danger btn-large" onClick={()=>this.deleteUser(user.id)}>delete</button>
                                    </td>
                                </tr>
                            )
                        }
                    </tbody>

                </table>

            </div>

            </div>
        )
    }
}
